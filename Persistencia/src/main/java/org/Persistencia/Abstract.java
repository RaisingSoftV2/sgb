package org.Persistencia;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ServiceLoader;
//import java.io.Console;

public abstract class Abstract {
	
	//private Console console;
	
	private final ThreadLocal<Connection> THREAD_CONNECTION = new ThreadLocal<Connection>();
	private final Properties propiedades;
	// Tipo de motor
	private static String MOTOR;
	// propiedades de conexión
	private final String servidor;
	private final String base;
	private final String user;
	private final String password;
	/* Singleton */
	private static Abstract singleton = null;

	/**
	 * Al instanciar cualquier fabrica, es tomarán las propiedades de conexion
	 * del archivo jdbc.properties
	 * 
	 * @throws RuntimeException
	 *             en caso de no poder cargar el archivo jdbc.properties
	 */
	public Abstract() {
		try {
			propiedades = new Properties();
			propiedades
					.load(getClass().getResourceAsStream("/jdbc.properties"));
			// parametros de conexion
			MOTOR = propiedades.getProperty("jdbc.motor");
			servidor = propiedades.getProperty("jdbc.servidor");
			base = propiedades.getProperty("jdbc.base");
			user = propiedades.getProperty("jdbc.user");
			password = propiedades.getProperty("jdbc.password");
			//if(MOTOR == null)
			//{
				//console.printf("No anda");
			//}
			//else
			//{
				//console.printf(MOTOR);	
			//}
			
		} catch (IOException ex) {
			throw new RuntimeException(
					"Falló lectura de archivo de configuracion", ex);
		}
	}

	/**
	 * Crea una instancia de tipo {@link AbstractDB} en función de configuración
	 * de servicio realizada en META-INF.sevices
	 * 
	 * @return Impletación de {@link AbstractDB}
	 */
	public static Abstract getInstance() {
		if (singleton == null) {
			ServiceLoader<Abstract> fabricasDisponibles = ServiceLoader
					.load(Abstract.class);
			for (Abstract fabrica : fabricasDisponibles) {
				if (fabrica.getMotor().equals(MOTOR)) {
					singleton = fabrica;
				}
			}
			if (singleton == null) {
				throw new RuntimeException(
						"No se encontró implementación para el motor " + MOTOR);
			}
		}
		return singleton;
	}

	/**
	 * Establece la conexión con la base de datos especificada.
	 * 
	 * @return conexión con la base de datos.
	 * @throws RepositorioException
	 */
	public Connection getConnection() throws RepositorioException {

		String url = getUrl(servidor, base);
		String driver = getDriver();

		// Carga el driver en memoria
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new RepositorioException(
					"No se encontró el driver " + driver, e);
		}

		// Conecta con la base de datos
		Connection conn = THREAD_CONNECTION.get();
		try {
			if (conn == null || conn.isClosed()) {
				conn = DriverManager.getConnection(url, user, password);
				THREAD_CONNECTION.set(conn);
			}
		} catch (SQLException e) {
			throw new RepositorioException("Fallo la conexión con la base de datos", e);
		}
		return conn;
	}

	/* Repositorios */
	//public abstract IPersonaRepositorio getPersonaRepositorio()
		//	throws RepositorioException;

	/* Metodos Template */
	protected abstract String getUrl(String servidor, String base);

	protected abstract String getDriver();

	protected abstract String getMotor();
	
	/* Repositorios */
	public abstract IRepo_CtaCte getRepo_CtaCte() 
			throws RepositorioException;

}

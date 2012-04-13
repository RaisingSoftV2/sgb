package org.ui;

import java.io.Console;
import org.Servicios.BancoServicio;
import org.Servicios.IAltaBancoServicio;

public class ConsolaUI implements IInterfazUsuario {

	private final IAltaBancoServicio altaService;
	private final Console console;
	private int IdBanco;
	private String Descripcion;
	
	public ConsolaUI(Console console) {
		this.console = console;
		altaService = new BancoServicio();
		altaService.init(this);
	}
	
	public int getIdBanco() {
		return IdBanco;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	private void iniciarApp() throws Exception {
		boolean seguir = true;
		do {
			console.printf("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			console.printf("                    TPF2012 - SGB                        \n");
			console.printf("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			console.printf("  1. Ingresar un Banco\n");
			console.printf("  2. Salir\n");
			String line = console.readLine();
			line = line.equals("") ? "0" : line;
			int opcion = Integer.valueOf(line);
			switch (opcion) {
			case 1:
				ingresar(console);
				break;
			case 2:
				seguir = false;
				break;
			default:
				seguir = true;
			}
		} while (seguir);
		
	}
	/**
	 * Inicia la ejecución de la aplicación de consola
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		ConsolaUI app = new ConsolaUI(System.console());
		app.iniciarApp();
	}

	private void ingresar(Console console) throws Exception {
		console.printf("---------------------\n");
		this.IdBanco = Integer.valueOf(console.readLine("IdBanco: "));
		this.Descripcion = console.readLine("Descripcion: ");
		String aceptar = console.readLine("¿Desea ingrear la persona? (s/n)");
		if (aceptar.toUpperCase().equals("S")) {
			altaService.agregar(this);
			console.printf("--- Carga Exitosa!! ---\n\n");
		}	
	}
}

package org.PostreSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.Dominio.Banco;
import org.Persistencia.IRepo_CtaCte;
import org.Persistencia.RepositorioException;
import org.Persistencia.UtilidadesDB;

public class Repo_Pg_CtaCte implements IRepo_CtaCte {

	private Connection connection;

	public Repo_Pg_CtaCte(Connection connection) {
		this.connection = connection;
	}

	public void agregar(Banco banco) throws RepositorioException {
		// TODO Auto-generated method stub
		String sql = 
			  " INSERT INTO banco" 
			+ "    (IdBanco, Descripcion)" 
		    + " VALUES"
		    + "    (?, ?)";
        PreparedStatement preparedStatement = null;
        
        try {
            // Banco
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, banco.getIdBanco());
            preparedStatement.setString(2, banco.getDescripcion());
            preparedStatement.executeUpdate();
            
        } catch(SQLException e) {
            throw new RepositorioException("FallÃ³ la inserciÃ³n de la persona " + banco, e);
        } finally {
            UtilidadesDB.close(preparedStatement);            
        }
	}

	public Banco cargar(int IdBanco) throws RepositorioException {
		// TODO en este spring no lo programamos.
		return null;
	}
}

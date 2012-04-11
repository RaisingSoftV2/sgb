package org.PostreSql;

import java.sql.Connection;

import org.Dominio.Banco;
import org.Persistencia.RepositorioException;
import org.Persistencia.IRepo_CtaCte;


public class PostgreSqlDB implements IRepo_CtaCte {
	private Connection connection;

}

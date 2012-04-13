package org.PostreSql;

import org.Persistencia.Abstract;
import org.Persistencia.IRepo_CtaCte;
import org.Persistencia.RepositorioException;
import java.io.Console;

public final class PostgreSqlDB extends Abstract {
	
	private Console console;
	
	/* ====== ImplementaciÃ³n de repositorios ====== */
	@Override
	public IRepo_CtaCte getRepo_CtaCte()
			throws RepositorioException {
		return new Repo_Pg_CtaCte(getConnection());
	}
	
	//@Override
	//public IPersonaRepositorio getPersonaRepositorio()
		//	throws RepositorioException {
		//return new PersonaPgRepositorio(getConnection());
	//}

	/* ====== ImplementaciÃ³n metodos template ====== */
	@Override
	protected String getUrl(String servidor, String base) {
		console.printf("servidor:" + servidor);
		return "jdbc:postgresql://" + servidor + "/" + base;
	}

	@Override
	protected String getDriver() {
		return "org.postgresql.Driver";
	}

	@Override
	protected String getMotor() {
		return "postgresql";
	}
}


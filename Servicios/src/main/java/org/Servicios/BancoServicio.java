package org.Servicios;

import org.Dominio.Banco;
import org.Persistencia.Abstract;
import org.Persistencia.IRepo_CtaCte;
import org.Persistencia.RepositorioException;
import org.ui.IInterfazUsuario;
public class BancoServicio implements IAltaBancoServicio {

	private Abstract fabricaDb;

	//public class PersonaService implements IAltaPersonaService, IListadoPersonaService {
	
	public void init(IInterfazUsuario ui) {
		fabricaDb = Abstract.getInstance();
		/*
		 * De ser necesario, esta inicialización setearía los
		 * datos iniciales básico en la UI: opciones, defaults, etc
		 */
	}

	public void agregar(IInterfazUsuario ui) throws ServicioException {
		
			int IdBanco = ui.getIdBanco();
			String Descripcion = ui.getDescripcion();
			Banco banco = new Banco(IdBanco, Descripcion);
			IRepo_CtaCte repo;
			try {
				repo = fabricaDb.getRepo_CtaCte();
				repo.agregar(banco);
			} catch (RepositorioException e) {
				throw new ServicioException("Fallo la incorporacion del Banco", e);
			}
	}
}
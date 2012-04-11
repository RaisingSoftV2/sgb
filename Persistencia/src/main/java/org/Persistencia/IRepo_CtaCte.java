package org.Persistencia;
import org.Dominio.Banco;

public interface IRepo_CtaCte {
	/**
	 * Agrega un objeto banco al medio persistente
	 *  
	 * @param banco entidad a agregar
	 * @throws RepositorioException
	 */
	void agregar(Banco banco) throws RepositorioException;
	
	/**
	 * 
	 * @param IdBanco
	 * @return
	 * @throws RepositorioException
	 */
	Banco cargar(int IdBanco) throws RepositorioException;
	
	/**
	 * 
	 * @param banco
	 * @throws RepositorioException
	 */
}

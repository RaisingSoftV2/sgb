package org.Persistencia;
<<<<<<< HEAD

import org.Dominio.Banco;


=======
import org.Dominio.Banco;

>>>>>>> a2f3759e12b710ebf4df6c9d1077eacb574e90d0
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

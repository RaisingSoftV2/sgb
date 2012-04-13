package org.Servicios;

import org.ui.IInterfazUsuario;

public interface IAltaBancoServicio extends IBaseServicio  {
	/**
	 * Agrega un banco al sistema
	 *  
	 * @throws ServicioException
	 */
	void agregar(IInterfazUsuario ui) throws ServicioException;
}

package org.Dominio;

public class Banco {
	private int IdBanco;
	private String Descripcion;
	
	public Banco(int IdBanco, String Descripcion) {
		super();
<<<<<<< HEAD
		this.IdBanco=IdBanco;
		this.Descripcion=Descripcion;
=======
		this.setIdBanco(IdBanco);
		this.setDescripcion(Descripcion);
>>>>>>> a2f3759e12b710ebf4df6c9d1077eacb574e90d0
	}

	public int getIdBanco() {
		return IdBanco;
	}

<<<<<<< HEAD
=======
	public void setIdBanco(int idBanco) {
		IdBanco = idBanco;
	}

>>>>>>> a2f3759e12b710ebf4df6c9d1077eacb574e90d0
	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder("Banco { ");
		buffer.append("IdBanco:");
		buffer.append(IdBanco);
		buffer.append("; Descripcion:");
		buffer.append(Descripcion);
		buffer.append(" }");
		return buffer.toString();
	}
}

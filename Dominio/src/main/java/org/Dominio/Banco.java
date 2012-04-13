package org.Dominio;

public class Banco {
	private int IdBanco;
	private String Descripcion;
	
	public Banco(int IdBanco, String Descripcion) {
		super();
		this.IdBanco=IdBanco;
		this.Descripcion=Descripcion;
	}

	public int getIdBanco() {
		return IdBanco;
	}

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

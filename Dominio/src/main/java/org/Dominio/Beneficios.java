package org.Dominio;

public class Beneficios {
	private int IdBeneficio;
	private String Descripcion;
	private Double Importe;
	
	public Beneficios(int IdBeneficio, String Descripcion, Double Importe) {
		super();
		this.setIdBeneficio(IdBeneficio);
		this.setDescripcion(Descripcion);
		this.setImporte(Importe);
	}

	public int getIdBeneficio() {
		return IdBeneficio;
	}

	public void setIdBeneficio(int idBeneficio) {
		IdBeneficio = idBeneficio;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Double getImporte() {
		return Importe;
	}

	public void setImporte(Double importe) {
		Importe = importe;
	}
	
	public String toString() {
		StringBuilder buffer = new StringBuilder("Beneficios { ");
		buffer.append("IdBeneficio:");
		buffer.append(IdBeneficio);
		buffer.append("; Descripcion:");
		buffer.append(Descripcion);
		buffer.append("; Importe:");
		buffer.append(Importe);
		buffer.append(" }");
		return buffer.toString();
	}
}

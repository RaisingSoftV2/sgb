package org.Dominio;

import java.util.Date;

public class Presupuesto {
	private int IdPresupuesto;
	private Date Fecha;
	private Date Anio;
	private int UnidadAcademica;
	private Double Importe;

	public Presupuesto(int IdPresupuesto, Date Fecha, Date Anio,int UnidadAcademica, Double Importe){
		super();
		this.setIdPresupuesto(IdPresupuesto);
		this.setFecha(Fecha);
		this.setAnio(Anio);
		this.setUnidadAcademica(UnidadAcademica);
		this.setImporte(Importe);
	}

	public int getIdPresupuesto() {
		return IdPresupuesto;
	}

	public void setIdPresupuesto(int idPresupuesto) {
		IdPresupuesto = idPresupuesto;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public Date getAnio() {
		return Anio;
	}

	public void setAnio(Date anio) {
		Anio = anio;
	}

	public int getUnidadAcademica() {
		return UnidadAcademica;
	}

	public void setUnidadAcademica(int unidadAcademica) {
		UnidadAcademica = unidadAcademica;
	}

	public Double getImporte() {
		return Importe;
	}

	public void setImporte(Double importe) {
		Importe = importe;
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder("Presupuesto { ");
		buffer.append("IdPresupuesto:");
		buffer.append(IdPresupuesto);
		buffer.append("; Fecha:");
		buffer.append(Fecha);
		buffer.append("; Anio:");
		buffer.append(Anio);
		buffer.append("; UnidadAcademica:");
		buffer.append(UnidadAcademica);
		buffer.append("; Importe:");
		buffer.append(Importe);
		buffer.append(" }");
		return buffer.toString();
	}
}

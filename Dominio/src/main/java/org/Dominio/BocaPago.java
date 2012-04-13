package org.Dominio;

import java.util.Date;

public class BocaPago {
	private int IdAlumno;
	private int IdBanco;
	private int CBU;
	private Date Fecha;
	private String NumCuentaBancaria;

	public BocaPago(int IdAlumno, int IdBanco, int CBU, Date Fecha, String NumCuentaBancaria){
		super();
		this.setIdAlumno(IdAlumno);
		this.setIdBanco(IdBanco);
		this.setCBU(CBU);
		this.setFecha(Fecha);
		this.setNumCuentaBancaria(NumCuentaBancaria);
	}

	public int getIdAlumno() {
		return IdAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		IdAlumno = idAlumno;
	}

	public int getIdBanco() {
		return IdBanco;
	}

	public void setIdBanco(int idBanco) {
		IdBanco = idBanco;
	}

	public int getCBU() {
		return CBU;
	}

	public void setCBU(int cBU) {
		CBU = cBU;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getNumCuentaBancaria() {
		return NumCuentaBancaria;
	}

	public void setNumCuentaBancaria(String numCuentaBancaria) {
		NumCuentaBancaria = numCuentaBancaria;
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder("BocaPago { ");
		buffer.append("IdAlumno:");
		buffer.append(IdAlumno);
		buffer.append("; IdBanco:");
		buffer.append(IdBanco);
		buffer.append("; Fecha:");
		buffer.append(Fecha);
		buffer.append("; NumCuentaBancaria:");
		buffer.append(NumCuentaBancaria);
		buffer.append(" }");
		return buffer.toString();
	}
}

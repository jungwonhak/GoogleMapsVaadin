package com.vaadin.tapio.googlemaps.demo;

/**
 * id_direccion 	Max: 11 
 * id_escuela		Max: 11 
 * id_municipio		Max: 11 
 * calle			Max: 45 
 * colonia			Max: 45 
 * numero			Max: 5
 * descripcion		Max: 45 
 * 
 * @author Santiago
 *
 */
public class Direccion {
	
	int id_direccion;
	int id_escuela;
	int id_municipio, id_estado;
	String calle;
	String colonia;
	String numero;
	String descripcion;
	double latitud, longitud;
	
	
	
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public int getId_estado() {
		return id_estado;
	}
	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}
	public int getId_direccion() {
		return id_direccion;
	}
	public void setId_direccion(int id_direccion) {
		this.id_direccion = id_direccion;
	}
	public int getId_escuela() {
		return id_escuela;
	}
	public void setId_escuela(int id_escuela) {
		this.id_escuela = id_escuela;
	}
	public int getId_municipio() {
		return id_municipio;
	}
	public void setId_municipio(int id_municipio) {
		this.id_municipio = id_municipio;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Direccion [id_direccion=" + id_direccion + ", id_escuela=" + id_escuela + ", id_municipio="
				+ id_municipio + ", id_estado=" + id_estado + ", calle=" + calle + ", colonia=" + colonia + ", numero="
				+ numero + ", descripcion=" + descripcion + ", latitud=" + latitud + ", longitud=" + longitud + "]";
	}
}

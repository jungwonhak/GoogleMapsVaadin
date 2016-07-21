package com.vaadin.tapio.googlemaps.demo;

/**
 * id_escuela 		Max 11
 * id_diocesis		Max 11
 * id_coordinacion	Max 11
 * nombre			Max 100
 * logo				Max 250
 * lema				Max 250
 * descripcion		Max 250
 * latitud			Max 20
 * longitud			Max 20

 * @author Santiago
 *
 */
public class Escuela {

	int id_escuela;
	int aceptada;
	int id_diocesis, id_provincia;
	int id_coordinacion;
	String nombre;
	String logo;
	String lema;
	String descripcion;
	Diocesis diocesis;
	Provincia provincia;
	
	public Escuela(){
	}
	
	public int getAceptada() {
		return aceptada;
	}
	public void setAceptada(int aceptada) {
		this.aceptada = aceptada;
	}
	public Diocesis getDiocesis() {
		return diocesis;
	}
	public void setDiocesis(Diocesis diocesis) {
		this.diocesis = diocesis;
	}
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	public int getId_provincia() {
		return id_provincia;
	}
	public void setId_provincia(int id_provincia) {
		this.id_provincia = id_provincia;
	}
	public int getId_escuela() {
		return id_escuela;
	}
	public void setId_escuela(int id_escuela) {
		this.id_escuela = id_escuela;
	}
	public int getId_diocesis() {
		return id_diocesis;
	}
	public void setId_diocesis(int id_diocesis) {
		this.id_diocesis = id_diocesis;
	}
	public int getId_coordinacion() {
		return id_coordinacion;
	}
	public void setId_coordinacion(int id_coordinacion) {
		this.id_coordinacion = id_coordinacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getLema() {
		return lema;
	}
	public void setLema(String lema) {
		this.lema = lema;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Escuela [id_escuela=" + id_escuela + ", aceptada=" + aceptada + ", id_diocesis=" + id_diocesis
				+ ", id_provincia=" + id_provincia + ", id_coordinacion=" + id_coordinacion + ", nombre=" + nombre
				+ ", logo=" + logo + ", lema=" + lema + ", descripcion=" + descripcion + ", diocesis=" + diocesis
				+ ", provincia=" + provincia + "]";
	}
}

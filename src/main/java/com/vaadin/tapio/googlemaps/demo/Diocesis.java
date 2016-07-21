package com.vaadin.tapio.googlemaps.demo;

public class Diocesis {
	int id_diocesis, id_provincia;
	String nombre;
	
	Provincia nombre_provincia;
	
	public int getId_diocesis() {
		return id_diocesis;
	}
	public void setId_diocesis(int id_diocesis) {
		this.id_diocesis = id_diocesis;
	}
	public int getId_provincia() {
		return id_provincia;
	}
	public void setId_provincia(int id_provincia) {
		this.id_provincia = id_provincia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Provincia getNombre_provincia() {
		return nombre_provincia;
	}
	public void setNombre_provincia(Provincia nombre_provincia) {
		this.nombre_provincia = nombre_provincia;
	}
	@Override
	public String toString() {
		return "Diocesis [id_diocesis=" + id_diocesis + ", id_provincia=" + id_provincia + ", nombre=" + nombre
				+ ", nombre_provincia=" + nombre_provincia + "]";
	}
}

package com.vaadin.tapio.googlemaps.demo;

public class Provincia {
	int id_provincia;
	String nombre;
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
	@Override
	public String toString() {
		return "Provincia [id_provincia=" + id_provincia + ", nombre=" + nombre + "]";
	}

	
	
}

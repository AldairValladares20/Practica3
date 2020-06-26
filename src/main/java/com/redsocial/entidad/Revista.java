package com.redsocial.entidad;

public class Revista {

	private int idrevista;
	private String nombre;
	private double precio;
	private String serie;
	private String categoria;
	private String fechaLanzamiento;
	private String fechaEdicion;
	public int getIdrevista() {
		return idrevista;
	}
	public void setIdrevista(int idrevista) {
		this.idrevista = idrevista;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	public void setFechaLanzamiento(String fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	public String getFechaEdicion() {
		return fechaEdicion;
	}
	public void setFechaEdicion(String fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}
}

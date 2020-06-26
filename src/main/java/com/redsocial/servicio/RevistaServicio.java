package com.redsocial.servicio;

import java.util.List;

import com.redsocial.entidad.Revista;

public interface RevistaServicio {

	public Revista insertaActualizaRevista(Revista obj);
	public void eliminaRevista(int idRevista);
	public List<Revista> listaRevista();
	public List<Revista> listaRevistaPorNombre(String nom);
	public List<Revista> listaRevista(int idCategoria, String nombre);
	
}

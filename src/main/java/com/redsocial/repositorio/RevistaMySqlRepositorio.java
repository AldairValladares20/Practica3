package com.redsocial.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.redsocial.entidad.Revista;

@Repository
public class RevistaMySqlRepositorio implements RevistaRepositorio{

	@Autowired
    private JdbcTemplate jdbcTemplate ;

	@Override
	public Revista insertaActualizaRevista(Revista obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminaRevista(int idRevista) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Revista> listaRevista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Revista> listaRevistaPorNombre(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Revista> listaRevista(int idCategoria, String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

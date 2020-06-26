package com.redsocial.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.redsocial.entidad.Categoria;
@Repository
public class CategoriaMySqlRepositorio implements CategoriaRepositorio {

	@Autowired
    private JdbcTemplate jdbcTemplate ;
	
	@Override
	public List<Categoria> listaCategoria() {
		// TODO Auto-generated method stub
		return null;
	}

}

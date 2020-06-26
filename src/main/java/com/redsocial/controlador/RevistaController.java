package com.redsocial.controlador;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.redsocial.entidad.Categoria;
import com.redsocial.entidad.Revista;
import com.redsocial.servicio.CategoriaServicio;
import com.redsocial.servicio.RevistaServicio;

@Controller
public class RevistaController {

	@Autowired
	private RevistaServicio RevistaServicio;
	
	@Autowired
	private CategoriaServicio CategoriaServicio;

	@RequestMapping("/verRevista")
	public String ver() {
		return "registraRevista";
	}
	
	@RequestMapping("/cargaCategoria")
	@ResponseBody
	public List<Categoria> listaDeporte() {
		return CategoriaServicio.listaCategoria();
	}
	
	@RequestMapping("/registraRevista")
	public String metRegistra(Revista obj,HttpSession session) {
		Revista aux = RevistaServicio.insertaActualizaRevista(obj);
		if(aux == null) {
			session.setAttribute("MENSAJE", "Registro errÃ³neo");
		}else {
			session.setAttribute("MENSAJE", "Registro exitos");
		}
		return "redirect:verRevista";
	}
}

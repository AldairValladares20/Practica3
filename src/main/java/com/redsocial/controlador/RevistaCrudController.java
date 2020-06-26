package com.redsocial.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redsocial.entidad.Revista;
import com.redsocial.servicio.RevistaServicio;

@Controller
public class RevistaCrudController {

	@Autowired
	private RevistaServicio servicio;
	
	@RequestMapping("/verCrudRevista")
	public String ver() {
		return "crudRevista";
	}
	
	@RequestMapping("/consultaCrudRevista")
	public String lista(String filtro, Model m) {
		List<Revista> lista =  servicio.listaRevistaPorNombre(filtro+"%");
		m.addAttribute("Revista", lista);
		return "crudRevista";
	}
	
	@RequestMapping("/registraActualizaCrudRevista")
	public String registraActualiza(Revista obj, Model m) {
		servicio.insertaActualizaRevista(obj);
		List<Revista> lista =  servicio.listaRevista();
		m.addAttribute("Revista", lista);
		return "crudRevista";
	}
	
	@RequestMapping("/eliminaCrudRevista")
	public String elimina(int id, Model m) {
		servicio.eliminaRevista(id);
		List<Revista> lista =  servicio.listaRevista();
		m.addAttribute("Revista", lista);
		return "crudRevista";
	}
	
}

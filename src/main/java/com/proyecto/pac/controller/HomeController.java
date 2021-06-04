package com.proyecto.pac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
	
	private IProductoService productoService;

	@GetMapping({"/index","/home","/",})
	public String index() {
		return "home";
	}
	
	
	@GetMapping({"/ubicanos"})
	public String ubicanos() {
		return "ubicanos";
	}
	
	@GetMapping("/productos/list")
	public String listarProductos(Model model) {
		List<Productos> listadoProductos = productoService.listarTodos();
		
 		model.addAttribute("titulo", "Lista de productos");
 		model.addAttribute("productos", listadoProductos);
		return "listar";
		
	}
}

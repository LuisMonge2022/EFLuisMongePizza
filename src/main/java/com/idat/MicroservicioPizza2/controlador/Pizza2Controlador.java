package com.idat.MicroservicioPizza2.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MicroservicioPizza2.modelo.Pizza;
import com.idat.MicroservicioPizza2.servicio.PizzaServicio;

@Controller
@RequestMapping("/api/v1/pizza")
public class Pizza2Controlador {
	
	
	
	@Autowired
	private PizzaServicio service;
	
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizza> listarPizza(){		
		return service.listarPizza();
		
	}
	
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarAlumno(@RequestBody Pizza pizza) {
		service.guardarPizza(pizza);	
		
	}
	

}

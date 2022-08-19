package com.idat.MicroservicioPizza2.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MicroservicioPizza2.modelo.Pizza;
import com.idat.MicroservicioPizza2.repositorio.PizzaRepositorio;

@Service
public class PizzaServicioImpl implements PizzaServicio{
	
	@Autowired
	private PizzaRepositorio repositorio;

	@Override
	public List<Pizza> listarPizza() {
		return repositorio.findAll();
	}

	@Override
	public void guardarPizza(Pizza pizza) {
		repositorio.save(pizza);
		
	}

}

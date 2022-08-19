package com.idat.MicroservicioPizza2.servicio;

import java.util.List;

import com.idat.MicroservicioPizza2.modelo.Pizza;

public interface PizzaServicio {
	
	public List<Pizza> listarPizza();
	
	public void guardarPizza(Pizza pizza);

}

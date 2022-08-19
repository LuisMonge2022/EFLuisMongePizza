package com.idat.MicroservicioPizza2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MicroservicioPizza2.modelo.Pizza;

@Repository
public interface PizzaRepositorio extends JpaRepository<Pizza, Integer>{

}

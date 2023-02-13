package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.deber14.modelo.Automovil;
import com.example.demo.deber14.service.IAutomovilService;

@SpringBootApplication
public class DeberesU3AnApplication implements CommandLineRunner {
	
	@Autowired
	private IAutomovilService automovilService;
	
	public static void main(String[] args) {
		SpringApplication.run(DeberesU3AnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.automovilService.actualizarMarca("Toyota", "Corolla", 3);
		this.automovilService.actualizarMarca("Chevrolet", "Tracker", 5);
		
		this.automovilService.eliminarMarca("Volkswagen");
		this.automovilService.eliminarMarca("Chevrolet");
	}

}

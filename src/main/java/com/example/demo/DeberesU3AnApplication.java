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
		Automovil auto = null;
		List<Automovil> autos = null;
		
		System.out.println("\nTyped Queries:\n");
		auto = this.automovilService.buscarPlacaTyped("PCF-6425");
		System.out.println("Consulta 1 (Por placa):"+auto);
		autos = this.automovilService.buscarMarcaTyped("Toyota");
		System.out.println("Consulta 2 (Por marca):"+autos.get(0));
		autos = this.automovilService.buscarModeloTyped("D Max");
		System.out.println("Consulta 3 (Por modelo):"+autos.get(0));
		
		System.out.println("\nNamed Queries:\n");
		auto = this.automovilService.buscarPlacaNamed("PDO-1546");
		System.out.println("Consulta 1 (Por placa):"+auto);
		autos = this.automovilService.buscarTipoMotorNamed("gasolina");
		System.out.println("Consulta 2 (Por tipo de motor):"+autos.get(0));
		autos = this.automovilService.buscarTipoTraccionNamed("4x2");
		System.out.println("Consulta 3 (Por tipo de traccion):"+autos.get(0));
		
		
		System.out.println("\nNative Queries:\n");
		auto = this.automovilService.buscarPlacaNative("PCR-1765");
		System.out.println("Consulta 1 (Por placa):"+auto);
		autos = this.automovilService.buscarPuertasModeloNative(5, "Yaris");
		System.out.println("Consulta 2 (Por numero de puertas y modelo):"+autos.get(0));
		autos = this.automovilService.buscarNumeroPasajerosMotorNative(5, "gasolina");
		System.out.println("Consulta 3 (Por numero de pasajeros y motor):"+autos.get(0));
		
		
		System.out.println("\nNamed Native Queries:\n");
		auto = this.automovilService.buscarPlacaNamedNative("XST-4321");
		System.out.println("Consulta 1 (Por placa):"+auto);
		autos = this.automovilService.buscarMarcaModeloNamedNative("Suzuki", "Grand Vitara");
		System.out.println("Consulta 2 (Por marca y el modelo):"+autos.get(0));
		autos = this.automovilService.buscarTraccionNamedNative("FWD");
		System.out.println("Consulta 3 (Por tipo de traccion):"+autos.get(0));
	}

}

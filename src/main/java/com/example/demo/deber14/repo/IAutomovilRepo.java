package com.example.demo.deber14.repo;

import java.util.List;

import com.example.demo.deber14.modelo.Automovil;

public interface IAutomovilRepo {
	public void insertar(Automovil automovil);
	
	//Typed Query
	public Automovil buscarPlacaTyped(String placa);
	public List<Automovil> buscarMarcaTyped(String marca);
	public List<Automovil> buscarModeloTyped(String modelo);
	
	//Named Query
	public Automovil buscarPlacaNamed(String placa);
	public List<Automovil> buscarTipoTraccionNamed(String tipoTraccion);
	public List<Automovil> buscarTipoMotorNamed(String tipoMotor);
	
	//Native Query
	public Automovil buscarPlacaNative(String placa);
	public List<Automovil> buscarNumeroPasajerosMotorNative(Integer numPasajeros, String motor);
	public List<Automovil> buscarPuertasModeloNative(Integer numPuertas, String modelo);
	
	//Named Native Query
	public Automovil buscarPlacaNamedNative(String placa);
	public List<Automovil> buscarMarcaModeloNamedNative(String marca, String modelo);
	public List<Automovil> buscarTraccionNamedNative(String traccion);
	
}

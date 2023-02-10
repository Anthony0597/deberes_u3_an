package com.example.demo.deber14.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.deber14.modelo.Automovil;
import com.example.demo.deber14.repo.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService {

	@Autowired
	private IAutomovilRepo automovilRepo;
	
	@Override
	public void agregar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepo.insertar(automovil);
	}

	@Override
	public Automovil buscarPlacaTyped(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPlacaTyped(placa);
	}

	@Override
	public List<Automovil> buscarMarcaTyped(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarMarcaTyped(marca);
	}

	@Override
	public List<Automovil> buscarModeloTyped(String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarModeloTyped(modelo);
	}

	@Override
	public Automovil buscarPlacaNamed(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPlacaNamed(placa);
	}

	@Override
	public List<Automovil> buscarTipoTraccionNamed(String tipoTraccion) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarTipoTraccionNamed(tipoTraccion);
	}

	@Override
	public List<Automovil> buscarTipoMotorNamed(String tipoMotor) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarTipoMotorNamed(tipoMotor);
	}

	@Override
	public Automovil buscarPlacaNative(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPlacaNative(placa);
	}

	@Override
	public List<Automovil> buscarNumeroPasajerosMotorNative(Integer numPasajeros, String motor) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarNumeroPasajerosMotorNative(numPasajeros, motor);
	}

	@Override
	public List<Automovil> buscarPuertasModeloNative(Integer numPuertas, String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPuertasModeloNative(numPuertas, modelo);
	}

	@Override
	public Automovil buscarPlacaNamedNative(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPlacaNamedNative(placa);
	}

	@Override
	public List<Automovil> buscarMarcaModeloNamedNative(String marca, String modelo) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarMarcaModeloNamedNative(marca, modelo);
	}

	@Override
	public List<Automovil> buscarTraccionNamedNative(String traccion) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarTraccionNamedNative(traccion);
	}

}

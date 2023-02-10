package com.example.demo.deber14.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.deber14.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutomovilRepoImpl implements IAutomovilRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.persist(automovil);
	}

	@Override
	public Automovil buscarPlacaTyped(String placa) {
		TypedQuery<Automovil> query = this.entityManager.createQuery(
				"select a from Automovil a where a.placa = :datoPlaca",Automovil.class);
		query.setParameter("datoPlaca", placa);
		return query.getSingleResult();
	}

	@Override
	public List<Automovil> buscarMarcaTyped(String marca) {
		TypedQuery<Automovil> query = this.entityManager.createQuery(
				"select a from Automovil a where a.marca = :datoMarca",Automovil.class);
		query.setParameter("datoMarca", marca);
		return query.getResultList();
	}

	@Override
	public List<Automovil> buscarModeloTyped(String modelo) {
		TypedQuery<Automovil> query = this.entityManager.createQuery(
				"select a from Automovil a where a.modelo = :datoModelo",Automovil.class);
		query.setParameter("datoModelo", modelo);
		return query.getResultList();
	}

	@Override
	public Automovil buscarPlacaNamed(String placa) {
		Query query = this.entityManager.createNamedQuery("Automovil.buscarPlaca");
		query.setParameter("datoPlaca", placa);
		return (Automovil) query.getSingleResult();
	}

	@Override
	public List<Automovil> buscarTipoTraccionNamed(String tipoTraccion) {
		Query query = this.entityManager.createNamedQuery("Automovil.buscarTipoTraccion");
		query.setParameter("datoTraccion", tipoTraccion);
		return query.getResultList();
	}

	@Override
	public List<Automovil> buscarTipoMotorNamed(String tipoMotor) {
		Query query = this.entityManager.createNamedQuery("Automovil.buscarTipoMotor");
		query.setParameter("datoMotor", tipoMotor);
		return query.getResultList();
	}

	@Override
	public Automovil buscarPlacaNative(String placa) {
		Query query = this.entityManager.createNativeQuery(
				"select * from automovil auto where auto_placa = :datoPlaca", Automovil.class);
		query.setParameter("datoPlaca", placa);
		return (Automovil) query.getSingleResult();
	}

	@Override
	public List<Automovil> buscarNumeroPasajerosMotorNative(Integer numPasajeros, String motor) {
		Query query = this.entityManager.createNativeQuery(
				"select * from automovil auto where auto_numero_pasajeros = :datoPasajeros and auto_tipo_motor= :datoMotor", Automovil.class);
		query.setParameter("datoPasajeros", numPasajeros);
		query.setParameter("datoMotor", motor);
		return query.getResultList();
	}

	@Override
	public List<Automovil> buscarPuertasModeloNative(Integer numPuertas, String modelo) {
		Query query = this.entityManager.createNativeQuery(
				"select * from automovil auto where auto_numero_puertas = :datoPuertas and auto_modelo = :datoModelo", Automovil.class);
		query.setParameter("datoPuertas", numPuertas);
		query.setParameter("datoModelo", modelo);
		return query.getResultList();
	}

	@Override
	public Automovil buscarPlacaNamedNative(String placa) {
		Query query = this.entityManager.createNamedQuery("Automovil.buscarPlacaNamedNative");
		query.setParameter("datoPlaca", placa);
		return (Automovil) query.getSingleResult();
	}

	@Override
	public List<Automovil> buscarMarcaModeloNamedNative(String marca, String modelo) {
		Query query = this.entityManager.createNamedQuery("Automovil.buscarMarcaModeloNamedNative");
		query.setParameter("datoMarca", marca);
		query.setParameter("datoModelo", modelo);
		return query.getResultList();
	}

	@Override
	public List<Automovil> buscarTraccionNamedNative(String traccion) {
		Query query = this.entityManager.createNamedQuery("Automovil.buscarTraccionNamedNative");
		query.setParameter("datoTraccion", traccion);
		return query.getResultList();
	}

}

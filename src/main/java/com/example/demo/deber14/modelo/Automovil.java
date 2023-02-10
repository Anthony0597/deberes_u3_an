package com.example.demo.deber14.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovil")
@NamedQueries({
		@NamedQuery(name = "Automovil.buscarPlaca", query = 
		"select a from Automovil a where a.placa = :datoPlaca"), 
		@NamedQuery(name = "Automovil.buscarTipoTraccion", query = 
		"select a from Automovil a where a.tipoTracion = :datoTraccion"),
		@NamedQuery(name = "Automovil.buscarTipoMotor", query = 
				"select a from Automovil a where a.tipoMotor = :datoMotor") 
})

@NamedNativeQueries({
	@NamedNativeQuery(name = "Automovil.buscarPlacaNamedNative", query = 
			"select * from automovil auto where auto_placa = :datoPlaca", resultClass = Automovil.class),
	@NamedNativeQuery(name = "Automovil.buscarMarcaModeloNamedNative", query = 
	"select * from automovil auto where auto_marca = :datoMarca and auto_modelo = :datoModelo", resultClass = Automovil.class),
	@NamedNativeQuery(name = "Automovil.buscarTraccionNamedNative", query = 
	"select * from automovil auto where auto_tipo_traccion = :datoTraccion", resultClass = Automovil.class),
})
public class Automovil {

	@Id
	@Column(name = "auto_placa")
	private String placa;
	@Column(name = "auto_marca")
	private String marca;
	@Column(name = "auto_modelo")
	private String modelo;
	@Column(name = "auto_numero_puertas")
	private Integer numeroPuertas;
	@Column(name = "auto_tipo_traccion")
	private String tipoTracion;
	@Column(name = "auto_tipo_motor")
	private String tipoMotor;
	@Column(name = "auto_numero_pasajeros")
	private Integer numeroPasajeros;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(Integer numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public String getTipoTracion() {
		return tipoTracion;
	}

	public void setTipoTracion(String tipoTracion) {
		this.tipoTracion = tipoTracion;
	}

	public String getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}

	public Integer getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(Integer numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", numeroPuertas="
				+ numeroPuertas + ", tipoTracion=" + tipoTracion + ", tipoMotor=" + tipoMotor + ", numeroPasajeros="
				+ numeroPasajeros + "]";
	}
	
	

}

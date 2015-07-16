package com.anselmopfeifer.controller;

public class Carro {
	private Integer codigo;
	private String modelo;
	private String tipo;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "|----------------------------------------------------\n|Codigo: " 
		+ codigo + "\n|Modelo: " + modelo + "\n|Tipo: " + tipo;
	}

}

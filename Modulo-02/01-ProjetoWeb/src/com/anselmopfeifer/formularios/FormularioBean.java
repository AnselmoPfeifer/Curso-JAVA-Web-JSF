package com.anselmopfeifer.formularios;

import javax.faces.bean.ManagedBean;


//Usando o ManagedBean e nao o faces-config.xml
@ManagedBean
public class FormularioBean {
	private String nome;

	//Get
	public String getNome() {
		return nome;
	}

	//Set
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Metodo para passar para Maiusculo o conteudo do formualrio
	public void enviar(){
		this.setNome(getNome().toUpperCase());		
	}
}

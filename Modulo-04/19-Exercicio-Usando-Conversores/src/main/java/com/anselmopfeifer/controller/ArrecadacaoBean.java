package com.anselmopfeifer.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.anselmopfeifer.model.Arrecadacao;
@ApplicationScoped
@ManagedBean
public class ArrecadacaoBean {
	private Arrecadacao arrecadacao = new Arrecadacao();
	private List<Arrecadacao> listaArrecadacaos = new ArrayList<Arrecadacao>();
	
	public void incluirLista(){
		this.listaArrecadacaos.add(this.arrecadacao);
		this.arrecadacao = new Arrecadacao();
	}
	
	public void soma(){
		
	}
	public Arrecadacao getArrecadacao() {
		return arrecadacao;
	}
	public List<Arrecadacao> getListaArrecadacaos() {
		return listaArrecadacaos;
	}
	
}

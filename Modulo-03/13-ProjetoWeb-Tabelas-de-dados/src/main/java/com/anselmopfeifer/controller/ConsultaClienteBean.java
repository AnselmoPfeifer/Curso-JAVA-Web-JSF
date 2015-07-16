package com.anselmopfeifer.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.anselmopfeifer.model.Cliente;

@ManagedBean
public class ConsultaClienteBean {
	private List<Cliente> clientes = new ArrayList<Cliente>();

	public void consultar() {
		this.getClientes().add(new Cliente(1, "Pedro Pereira", "Campo Grande MS"));
		this.getClientes().add(new Cliente(2, "José da Silva", "Sao Paulo SP"));
		this.getClientes().add(new Cliente(4, "Joaquim Manoel", "Rio Janeiro RJ"));
		this.getClientes().add(new Cliente(6, "Sebastião Souza", "Salvador BA"));
		this.getClientes().add(new Cliente(7, "Joana Carvalho", "Florianopolis SC"));
		this.getClientes().add(new Cliente(10, "Maria José", "Porto Alegre POA"));
	}

	public List<Cliente> getClientes() {
		return clientes;
	}


}

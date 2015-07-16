package com.anselmopfeifer.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.anselmopfeifer.model.Cliente;
@ViewScoped
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
	public void salvar(){
		FacesContext context = FacesContext.getCurrentInstance();
		if(!context.getMessages().hasNext()){
			this.adicionarMensagem(null, FacesMessage.SEVERITY_INFO, 
					"Alteracao Salva", "As alterações foram salvas com sucesso");
		}
		
		for(Cliente cliente : this.getClientes()){
			System.out.println(cliente.getCodigo() + " - " + cliente.getNome());
		}
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public void adicionarMensagem(String clienteID, Severity severity, String summary, String detail){
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage mensage = new FacesMessage(severity, summary, detail);
		
		context.addMessage(clienteID, mensage);
	}


}

package com.anselmopfeifer.formularios;

import javax.faces.bean.ManagedBean;


//Usando o ManagedBean e nao o faces-config.xml
@ManagedBean
public class FormularioSomaBean {
	private Integer valor1 = 0;
	private Integer valor2 = 0;
	private Integer total = 0;
	
	public Integer getValor1() {
		return valor1;
	}
	
	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}
	
	public Integer getValor2() {
		return valor2;
	}
	
	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	//Metodo para Somar as entradas em FormularioSoma.xhtml
	public void somar(){
		setTotal(valor1 + valor2); 
	}

	
}

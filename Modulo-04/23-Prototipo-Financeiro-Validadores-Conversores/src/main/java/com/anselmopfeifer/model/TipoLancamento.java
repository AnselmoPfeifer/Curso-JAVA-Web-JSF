package com.anselmopfeifer.model;

public enum TipoLancamento {
	RECEITA("Receita"),
	DESPESA("Despesa");
	//INVESTIMENTO("Investimento");
	
	private String descricao;

	
	TipoLancamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}	
}

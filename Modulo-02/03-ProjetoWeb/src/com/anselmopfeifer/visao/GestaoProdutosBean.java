package com.anselmopfeifer.visao;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.anselmopfeifer.entidade.Produto;

@ManagedBean
@ApplicationScoped
/*
 * @ApplicationScoped Quando usamos o Escopo do Tipo APlication o servidor
 * armazena as informações armazenadas no Serviço ate que serviço seja
 * reiniciado
 */

/*
 * @SessionScoped Quando usamos o Escopo do Tipo @SessionScoped o servidor
 * armazena as informações na sessao do usuario (navegador) quando o mesmo
 * usuario troca de navegador ele perde a sessão, pois o sistema entende que ele
 * esta em outro computador.
 */
public class GestaoProdutosBean {

	private List<Produto> produtos;
	private Produto produto;

	public GestaoProdutosBean() {
		this.produtos = new ArrayList<Produto>();
		this.produto = new Produto();
	}

	public void incluir() {
		this.produtos.add(this.produto);
		this.produto = new Produto();
	}

	public Produto getProduto() {
		return produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}

package com.anselmopfeifer.visao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.anselmopfeifer.entidade.Produto;

@ManagedBean

/*@NoneScoped
 * Quando Usamos o @NoneScoped Ele nao tem tempo de vida nenhum
 * ele inicia por demanda, ele tambem nao chama o metodo PreDestroy
 * Somente a PostContruct a cada requisição que feita.
 * ELE NAO TEM O METODO DE LISTA
 */

/*@RequestScoped
 * Quando usamos o Scopo de Requisição ele finaliza a requisição 
 * quando uma nova request eh criada. Seu tempo de vida eh muito curto
 */
@ViewScoped
/*@ViewScoped
 * Quando usamos o @ViewScoped as vizualizações estão somente na View do usuario, 
 * ou seja quando ele recarrega a pagina os dados são encerrados
 */
public class GestaoProdutosBean implements Serializable {

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

	@PostConstruct
	public void inicializar(){
		System.out.println("Inicializou o Bean");
	}
	@PreDestroy
	public void finalizar(){
		System.out.println("Finalizou o Bean");
	}
	
	public Produto getProduto() {
		return produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}

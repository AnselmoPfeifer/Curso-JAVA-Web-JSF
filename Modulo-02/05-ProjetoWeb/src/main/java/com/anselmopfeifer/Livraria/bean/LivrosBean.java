package com.anselmopfeifer.Livraria.bean;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.anselmopfeifer.Livraria.model.Livros;

@ManagedBean
@ApplicationScoped
public class LivrosBean {
	private Livros livros;
	private List<Livros> lista;
	private Livros livroSelecionado;
	private String mensagemVazio;
	
	public void verificarTituloVazio(){
		if("".equals(livros.getNome()) && 
				"".equals(livros.getAutor()) && 
				"".equals(livros.getDescricao())){
			mensagemVazio = "Os valores acima nao podem ficar vazio";
		}
			
	}
	
	public void verificarInclusao(ActionEvent event){
		if("".equals(livros.getAutor()) || "".equals(livros.getDescricao())){
			this.livros.setAutor("Sem Autor");
			this.livros.setDescricao("Sem Descrição");
		}
	}
	
	public LivrosBean(){
		this.lista = new ArrayList<Livros>();
		this.livros = new Livros();
	}
	
	public void adicionarLista(){
		this.lista.add(this.livros);
		this.livros = new Livros();
		}

	public void excluir(){
		this.lista.remove(this.livroSelecionado);
	}
	public Livros getLivroSelecionado() {
		return livroSelecionado;
	}

	public void setLivroSelecionado(Livros livroSelecionado) {
		this.livroSelecionado = livroSelecionado;
	}

	public Livros getLivros() {
		return livros;
	}

	public void setLivros(Livros livros) {
		this.livros = livros;
	}

	public List<Livros> getLista() {
		return lista;
	}

	public String getMensagemVazio() {
		return mensagemVazio;
	}

	public void setMensagemVazio(String mensagemVazio) {
		this.mensagemVazio = mensagemVazio;
	}
	
}

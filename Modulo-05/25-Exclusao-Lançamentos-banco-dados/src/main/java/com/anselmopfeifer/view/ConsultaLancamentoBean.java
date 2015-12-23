package com.anselmopfeifer.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import com.anselmopfeifer.model.Lancamento;
import com.anselmopfeifer.util.FacesUtil;
import com.anselmopfeifer.util.HibernateUtil;

@ManagedBean
public class ConsultaLancamentoBean implements Serializable {

	private List<String> lancamentos = new ArrayList<String>();
	private Lancamento lancamentoSelecionado;

	public void excluir() {
		if(this.lancamentoSelecionado.isPago()) {
			FacesUtil.addMensagem(FacesMessage.SEVERITY_ERROR,
					"Lançamento já foi pago e nao pode ser excluido!");
		} else {
			Session session = HibernateUtil.getSession();
			Transaction trx = session.beginTransaction();
			
			session.delete(lancamentoSelecionado);
			
			trx.commit();
			session.close();
			
			this.inicializar();
			
			FacesUtil.addMensagem(FacesMessage.SEVERITY_INFO,"Lançamento Excluido com Sucesso!");
		}

	}

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void inicializar() {
		Session session = HibernateUtil.getSession();
		this.lancamentos = session.createCriteria(Lancamento.class)
				.addOrder(Order.desc("dataVencimento")).list();
	}

	public List<String> getLancamentos() {
		return lancamentos;
	}

	public Lancamento getLancamentoSelecionado() {
		return lancamentoSelecionado;
	}

	public void setLancamentoSelecionado(Lancamento lancamentoSelecionado) {
		this.lancamentoSelecionado = lancamentoSelecionado;
	}

}
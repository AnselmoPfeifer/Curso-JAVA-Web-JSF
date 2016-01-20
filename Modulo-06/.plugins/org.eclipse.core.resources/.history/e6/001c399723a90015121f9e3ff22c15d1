package com.anselmopfeifer.util;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class FacesUtil {
	public static void addMensagem(Severity tipo, String mensagem) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(tipo, mensagem, mensagem));
	}

}

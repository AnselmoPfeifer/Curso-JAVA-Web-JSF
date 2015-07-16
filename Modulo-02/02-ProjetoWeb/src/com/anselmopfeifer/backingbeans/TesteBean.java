package com.anselmopfeifer.backingbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

@ManagedBean
public class TesteBean {
	private HtmlInputText campo;
	private HtmlCommandButton button;
	
	public void testar(){
		if(this.campo.isDisabled()){
			this.campo.setDisabled(false);
			this.campo.setStyle("");
		}else{
			this.campo.setDisabled(true);
			this.button.setStyle("background-color:red; color: blue");
		}
		
	}

	public HtmlInputText getCampo() {
		return campo;
	}

	public void setCampo(HtmlInputText campo) {
		this.campo = campo;
	}

	public HtmlCommandButton getButton() {
		return button;
	}

	public void setButton(HtmlCommandButton button) {
		this.button = button;
	}
	
	
	
	
}

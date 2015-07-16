package com.anselmopfeifer.validador;

import java.util.Calendar;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("com.anselmopfeifer.DiaUtil")
public class DiaUtilValidador implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		Calendar data = Calendar.getInstance();
		data.setTime((Date) value);

		int diaDaSemna = data.get(Calendar.DAY_OF_WEEK);

		if (diaDaSemna == Calendar.SATURDAY || diaDaSemna == Calendar.SUNDAY) {
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Data não permitida", "Volte num dia Util");
			throw new ValidatorException(msg);
		}

	}

}

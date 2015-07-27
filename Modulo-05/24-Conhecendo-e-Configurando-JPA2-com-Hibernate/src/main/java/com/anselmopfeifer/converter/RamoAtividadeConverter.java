package com.anselmopfeifer.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.anselmopfeifer.model.RamoAtividade;
import com.anselmopfeifer.service.GestaoRamosAtividades;

@FacesConverter(forClass = RamoAtividade.class)
public class RamoAtividadeConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		RamoAtividade retorno = null;

		if (value != null) {
			GestaoRamosAtividades gestaoRamosAtividades = new GestaoRamosAtividades();
			retorno = gestaoRamosAtividades.buscarPorCodigo(new Integer(value));
			
			return retorno;
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {

		if (value != null) {
			return ((RamoAtividade) value).getCodigo().toString();
		}
		return null;
	}

}
package com.anselmopfeifer.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.anselmopfeifer.model.RamoAtividade;

public class GestaoRamosAtividades {
private static Map<Integer, RamoAtividade> atividades = new HashMap<Integer, RamoAtividade>();
	
	static {
		atividades.put(1, new RamoAtividade(1, "Projetos"));
		atividades.put(2, new RamoAtividade(2, "Suporte"));
		atividades.put(3, new RamoAtividade(3, "Auditoria"));
	}
	
	public List<RamoAtividade> listarTodas() {
		List<RamoAtividade> atividades = new ArrayList<RamoAtividade>();
		atividades.addAll(GestaoRamosAtividades.atividades.values());
		return atividades;
	}
	
	public RamoAtividade buscarPorCodigo(Integer codigo) {
		return atividades.get(codigo);
	}
}

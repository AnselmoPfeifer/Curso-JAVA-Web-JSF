package com.anselmopfeifer.model;

import java.util.Date;

public class Arrecadacao {
	private Date dataJogo;
	private String timeCasa;
	private Integer golsTimeCasa;
	private String timeVisitante;
	private Integer golsTimesVisitante;
	private Double valorArrecadado;
	
	public Date getDataJogo() {
		return dataJogo;
	}
	public void setDataJogo(Date dataJogo) {
		this.dataJogo = dataJogo;
	}
	public String getTimeCasa() {
		return timeCasa;
	}
	public void setTimeCasa(String timeCasa) {
		this.timeCasa = timeCasa;
	}
	public Integer getGolsTimeCasa() {
		return golsTimeCasa;
	}
	public void setGolsTimeCasa(Integer golsTimeCasa) {
		this.golsTimeCasa = golsTimeCasa;
	}
	public String getTimeVisitante() {
		return timeVisitante;
	}
	public void setTimeVisitante(String timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	public Integer getGolsTimesVisitante() {
		return golsTimesVisitante;
	}
	public void setGolsTimesVisitante(Integer golsTimesVisitante) {
		this.golsTimesVisitante = golsTimesVisitante;
	}
	public Double getValorArrecadado() {
		return valorArrecadado;
	}
	public void setValorArrecadado(Double valorArrecadado) {
		this.valorArrecadado = valorArrecadado;
	}
	
}

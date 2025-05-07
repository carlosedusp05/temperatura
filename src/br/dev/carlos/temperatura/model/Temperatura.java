package br.dev.carlos.temperatura.model;

public class Temperatura {
	
	//atributo da classe
	private double celsius;

	//metodos da classe
	public double getCelsius() {
		return celsius; 
		
	}
	
	//Lógicas de conversão 
	public void setCelsius( double celsius) {
		this.celsius = celsius;
		
	}
	
	public double converterParaKelvin() {
		double kelvin = celsius + 273.15;
		return kelvin;
		
	}
	
	public double converterParaFahreinheit() {
		double fahreinheit	=	(celsius * 9/5) + 32;
		return fahreinheit;
	}
	
}
	
	
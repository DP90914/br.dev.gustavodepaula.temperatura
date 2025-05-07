package br.dev.gustavodepaula.temperatura.model;

public class Temperatura {
	//criacao da variavel
	private double celsius;
	
	//metodo set da variavel celsius 
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	//metodo get da variavel celsius
	public double getCelsius() {
		return celsius;
	}
	//calculo para conversao de kelvin
	public double converterKelvin() {
		double kelvin = celsius + 273.15;
		return kelvin;
	}
	//calculo para conversao fahreiheit
	public double converterFahreiheit() {
		double fahreiheit = (celsius * 1.8) + 32;
		return fahreiheit;
	}
}

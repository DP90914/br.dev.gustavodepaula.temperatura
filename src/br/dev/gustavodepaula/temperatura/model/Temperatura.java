package br.dev.gustavodepaula.temperatura.model;

public class Temperatura {
	private double celsius;
	
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	
	public double getCelsius() {
		return celsius;
	}
	public double converterKelvin(double celsiusDouble) {
		double kelvin = celsius + 273;
		return kelvin;
	}
	public double converterFahreiheit() {
		double fahreiheit = (celsius * 1.8) + 32;
		return fahreiheit;
	}
}

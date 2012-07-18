package Capitulo10;

public class Circulo implements IAreaCalculavel{
	private int raio;
	
	public Circulo(int raio){
		this.raio=raio;
		
	}

	public double calculaArea() {
		return Math.PI*Math.pow(this.raio, 2);
	}

}

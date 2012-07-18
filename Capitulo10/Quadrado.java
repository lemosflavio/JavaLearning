package Capitulo10;

public class Quadrado implements IAreaCalculavel{
	private int lado;
	
	public Quadrado(int lado){
		this.lado=lado;
	}

	public double calculaArea() {
		
		return this.lado * this.lado;
	}
	
	

}

package Capitulo10;

public class Retangulo implements IAreaCalculavel{
	private int largura, altura;
	
	public Retangulo(int largura, int altura){
		this.altura=altura;
		this.largura=largura;
	}

	public double calculaArea() {
		return this.altura*this.largura;
	}

}

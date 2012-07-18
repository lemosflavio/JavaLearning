package Capitulo4;

public class MainPorta {
	public static void main(String[] args) {
		Porta p1= new Porta();
		p1.cor="Marrom";
		p1.dimensaoZ=10;
		p1.dimensaoX=50;
		p1.dimensaoY=50;
		p1.abre();
		p1.mostra();
		p1.fecha();
		p1.cor="Vermelha";
		p1.mostra();
		
		
	}

}

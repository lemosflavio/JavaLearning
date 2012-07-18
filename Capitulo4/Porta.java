package Capitulo4;

public class Porta {
	boolean aberta;
	String cor;
	int dimensaoX,dimensaoY,dimensaoZ;
	
	void abre(){
		aberta= true;
	}
	void fecha(){
		aberta= false;
	}
	void pinta(String s){
		cor = s;
	}
	boolean estaAberta(){
		return aberta;
	}
	void mostra(){
		System.out.println(cor+" "+dimensaoZ+" "+dimensaoX+" "+dimensaoY+" "+aberta+"");
	}

}

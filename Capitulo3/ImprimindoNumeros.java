package Capitulo3;

public class ImprimindoNumeros {
	public static void main(String[] args) {
		int soma=0;
		for(int x=150;x<=300;x++){
			System.out.println(x);
		}
		for(int x=0;x<=1000;x++){
			soma+=x;
			System.out.println(soma);
		}
		for(int x=1;x<=100;x++){
			if(x%3==0){
				System.out.println(x);
			}
		}
		for(int x=0;x<=10;x++){
			System.out.println("O Fatorial de "+x+" é "+fatorial(x));
		}
		
	}
    static int fatorial(int x){
    	int fat=1;
    	for(;x>=1;x--){
    		fat*=x;
    	}
    	return fat;
    }

}

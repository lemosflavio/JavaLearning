package Capitulo11;

public class TestandoADivisao {
	public static void main(String[] args) {
		int x= 1570;
		try{
		x=x/0;
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println(x);
	}

}

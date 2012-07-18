package Capitulo10;

public class MainTributavel {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(100);
		
		System.out.println(cc.calculaTributos());
		
		ITributavel t = cc;
		
		System.out.println(t.calculaTributos());
	}

}

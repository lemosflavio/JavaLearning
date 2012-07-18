package Capitulo7;

public class MainBanco {
	public static void main(String[] args) {
		Banco b1= new Banco();
		AtualizadorDeContas adc= new AtualizadorDeContas(0.1);
		Conta []c1 = new Conta[10];
		
		
		for (int i = 0; i < b1.pegaTotalDeContas(); i++) {
			c1[i].setSaldo(500*(i+1));
			b1.adiciona(c1[i],i);
		}
	}

}

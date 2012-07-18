package Capitulo11;

public class MainConta {
	public static void main(String[] args) {
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		try {
			c.depositar(-1000);
		} catch (IllegalArgumentException e) {
			System.out.println("Valor a depositar invalido");
		}
		try {
			cc.depositar(-1000);
		} catch (IllegalArgumentException e) {
			System.out.println("Valor a depositar invalido");
		}
		try {
			cp.depositar(-1000);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		

		c.atualiza(0.01);
		cc.atualiza(0.01);
		cp.atualiza(0.01);

		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}

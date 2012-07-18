package Capitulo10;

public class ContaCorrenteComInterface implements IConta {
	private double saldo;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void atualiza(double taxa) {
		setSaldo(getSaldo() * taxa);
	}

	public void depositar(double deposito) {
		setSaldo(getSaldo() + deposito - 0.10);

	}

	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

	public double getSaldo() {

		return this.saldo;
	}

	public void retira(double retirada) {
		this.saldo -= retirada;
	}

}

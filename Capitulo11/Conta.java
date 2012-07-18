package Capitulo11;

public class Conta {
	private double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double deposito) {

		if (deposito < 0) {
			throw new ValorInvalidoException(deposito);
		} else {

			this.saldo += deposito;
		}
	}

	public void sacar(double saque) {
		this.saldo -= saque;
	}

	public void atualiza(double taxa) {

		this.saldo *= taxa;
	}

}

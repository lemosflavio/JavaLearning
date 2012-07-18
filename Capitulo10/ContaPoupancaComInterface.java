package Capitulo10;

public class ContaPoupancaComInterface implements IConta{
	private double saldo;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void atualiza(){
		setSaldo(getSaldo()*3);
	}


	public double getSaldo() {

		return this.saldo;
	}


	public void depositar(double deposito){
		this.saldo += deposito;
	}
	public void retira(double saque){
		this.saldo -= saque;
	}
	
	public void atualiza(double taxa){
		this.saldo*=taxa;
	}

}

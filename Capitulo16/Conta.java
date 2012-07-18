package Capitulo16;

public class Conta {
	private int numero;
	private double saldo;
	
	public double getSaldo(){
		return this.saldo;
	}
	public void setSaldo(double saldo){
		this.saldo= saldo;
	}
	
	public void depositar(double deposito){
		this.saldo += deposito;
	}
	public void sacar(double saque){
		this.saldo -= saque;
	}
	
	public void atualiza(double taxa){
		this.saldo*=taxa;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

}

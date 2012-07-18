package Capitulo9;

abstract public class Conta {
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
	
	abstract void atualiza(double taxa);

}

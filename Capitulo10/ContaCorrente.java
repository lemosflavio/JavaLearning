package Capitulo10;

public class ContaCorrente extends Conta implements ITributavel{
	public void atualiza(){
		setSaldo(getSaldo()*2);
	}
	public void depositar(double deposito){
		setSaldo(getSaldo()+deposito-0.10);
	}
	
	public double calculaTributos() {
		return this.getSaldo()*0.01;
	}

}

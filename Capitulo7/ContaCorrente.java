package Capitulo7;

public class ContaCorrente extends Conta{
	public void atualiza(){
		setSaldo(getSaldo()*2);
	}
	public void depositar(double deposito){
		setSaldo(getSaldo()+deposito-0.10);
	}

}

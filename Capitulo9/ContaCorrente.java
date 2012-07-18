package Capitulo9;

public class ContaCorrente extends Conta{
	public void atualiza(){
		setSaldo(getSaldo()*2);
	}
	public void depositar(double deposito){
		setSaldo(getSaldo()+deposito-0.10);
	}
	void atualiza(double taxa) {
		// TODO Auto-generated method stub
		
	}

}

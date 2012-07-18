package Capitulo7;

public class Banco {
	private Conta [] conta;
	
	void adiciona(Conta c1,int x){
		this.conta[x]=c1;
	}
	public void setConta(Conta[] conta){
		this.conta=conta;
	}
	
	Conta pegaConta(int x){
		return conta[x];
	}
	int pegaTotalDeContas(){
		return conta.length;
	}

}

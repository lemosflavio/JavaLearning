package Capitulo16;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	public void atualiza(){
		setSaldo(getSaldo()*3);
	}

	public int compareTo(ContaPoupanca outro) {
		if(this.getNumero()>outro.getNumero()){
			return -1;
		}
		if(this.getNumero()<outro.getNumero()){
			return 1;
		}
		return 0;
	}

}

package Capitulo7;

public class AtualizadorDeContas {
	private double saldoTotal= 0;
	private double selic;
	
	public AtualizadorDeContas(double selic) {
		this.selic=selic;
	}
	
	void roda(Conta c){
		System.out.println("Saldo anterior: "+c.getSaldo());
		c.atualiza(0.01);
		System.out.println("Saldo final:"+c.getSaldo());
		//saldoTotal=c.getSaldo();
	}
	
	public double getSaldoTotal(){
		return this.saldoTotal;
	}
	public void setSaldoTotal(double saldoTotal){
		this.saldoTotal=saldoTotal;
	}
	public double getSelic(){
		return this.selic;
	}
	public void setSelic(double selic){
		this.selic=selic;
	}

}

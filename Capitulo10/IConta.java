package Capitulo10;

public interface IConta {
	
	double getSaldo();
	void depositar(double deposito);
	void retira(double retirada);
	void atualiza(double taxa);

}

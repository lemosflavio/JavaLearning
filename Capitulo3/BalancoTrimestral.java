package Capitulo3;

public class BalancoTrimestral {
	public static void main(String[] args) {
		int gastoJaneiro = 15000;
		int gastoFevereiro = 27000;
		int gastoMarco = 17000;
		int gastoTrimestral = gastoFevereiro + gastoJaneiro + gastoMarco;
		int mediaMensal = gastoTrimestral/3;
		System.out.println("Gasto Trimestra: "+gastoTrimestral);
		System.out.println("Gastos mensais: "+mediaMensal);
	}

}

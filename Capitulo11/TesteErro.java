package Capitulo11;

public class TesteErro {

	public static void main(String[] args) {
		System.out.println("inicio do main");
		try {
			metodo1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("erro: " + e);
		}
		System.out.println("Fim do main");
	}

	static void metodo1() {
		System.out.println("Inicio do metodo 1");

		metodo2();

		System.out.println("Fim do metodo 1");
	}

	static void metodo2() {
		System.out.println("Inicio do metodo 2");
		int[] vetor = new int[10];
		for (int i = 0; i <= 15; i++) {
			vetor[i] = i;
			System.out.println(i);

		}

		System.out.println("Fim do metodo 2");
	}

}

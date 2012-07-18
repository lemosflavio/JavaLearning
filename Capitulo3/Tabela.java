package Capitulo3;

public class Tabela {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			System.out.print(i + " ");
			for (int j = 1, x = 2; j < i; j++, x++) {
				System.out.print(x * i + " ");
			}
			System.out.println();
		}
	}

}

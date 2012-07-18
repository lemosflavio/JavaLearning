package Capitulo15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteEntrada {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("arquivo");
		InputStreamReader inr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(inr);
		//Funciona da mesma forma só que perde um pouco de legibilidade
		BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("Teste.txt")));
		
		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		linha = br2.readLine();
		
		while (linha != null) {
			System.out.println(linha);
			linha = br2.readLine();
		}

	}

}

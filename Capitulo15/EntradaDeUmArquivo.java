package Capitulo15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class EntradaDeUmArquivo {
	public static void main(String[] args) throws IOException {
		InputStream  in = new FileInputStream("arquivo");
		Scanner entrada = new Scanner(in);
		
		while(entrada.hasNextLine()){
			System.out.println(entrada.nextLine());
		}
		in.close();
	}
	

}

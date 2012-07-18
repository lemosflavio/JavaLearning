package Capitulo15;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class EntradaESaidaDeArquivo {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo");
		Scanner entrada = new Scanner(is);
		Scanner entradaExtra = new Scanner(System.in);
		String extra = entradaExtra.nextLine();

		OutputStream op = new FileOutputStream("arquivo final.txt");
		OutputStreamWriter opw = new OutputStreamWriter(op);
		BufferedWriter bw = new BufferedWriter(opw);

		while (entrada.hasNextLine()) {
			String linha = entrada.nextLine();
			bw.write(linha);
			bw.newLine();
			bw.write(extra);
			bw.newLine();
		}

		bw.close();

	}

}

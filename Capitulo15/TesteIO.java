package Capitulo15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TesteIO {
	public static void main(String[] args) throws IOException {
		
		

		Scanner nome = new Scanner(System.in);
		InputStream is = new FileInputStream(nome.nextLine()+".txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		while (s != null) {
			System.out.println(s);
			s = br.readLine();
		}
		br.close();
	}

}

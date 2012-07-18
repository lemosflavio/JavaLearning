package Capitulo3;

import java.util.Scanner;

public class Condicao {
	public static void main(String[] args) {
		int x,y=0;
		Scanner scan = new Scanner(System.in);
		x=scan.nextInt();
		while(y!=1) {
			if (x % 2 == 0) {
				y = x / 2;
			} else {
				y = 3 * x + 1;
			}
			x=y;
			System.out.println(y);
		}
	}
}

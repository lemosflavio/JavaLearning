package Capitulo3;

public class Fibonacci {
	public static void main(String[] args) {
		int [] fibo= new int[1000];
		fibo[0]=0;
		fibo[1]=1;
		for(int x=2;x<=100;x++){
			System.out.println(fibo[x-1]);
			fibo[x]=fibo[x-2]+fibo[x-1];
			
			if(fibo[x]>=100){
				break;
			}
		}
	}

}

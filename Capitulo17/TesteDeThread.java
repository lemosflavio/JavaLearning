package Capitulo17;

public class TesteDeThread {
	public static void main(String[] args) {
		ProgramaTeste p1 = new ProgramaTeste();
		p1.setId(1);
		Thread t1 = new Thread(p1);
		t1.start();
		ProgramaTeste p2 = new ProgramaTeste();
		p2.setId(2);
		Thread t2= new Thread(p2);
		t2.start();
	}

}

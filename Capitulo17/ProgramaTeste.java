package Capitulo17;


public class ProgramaTeste implements Runnable {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void run(){
		for(int x=0;x<1000;x++){
			System.out.println("Seu id é: "+id+" e seu valor: "+x);
		}
	}

}

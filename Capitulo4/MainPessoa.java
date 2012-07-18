package Capitulo4;

public class MainPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.idade=18;
		p1.nome="Ricardo";
		p1.fazAniversario();
		System.out.println(p1.nome + p1.idade);
	}

}

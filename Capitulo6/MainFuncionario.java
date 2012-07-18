package Capitulo6;

public class MainFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = f1;
		Data data = new Data();
		data.dia = 1;
		data.mes = 5;
		data.ano = 1542;

		f1.setNome("Carlos");
		f1.setSalario(500);
		f1.bonifica(10);
		f1.setDataEntrada(data);

		f1.mostra();

		if (f1 == f2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

	}

}

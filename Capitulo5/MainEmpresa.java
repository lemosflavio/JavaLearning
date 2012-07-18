package Capitulo5;



public class MainEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		Funcionario f = new Funcionario();
		f.nome="Rogerio";
		f.atividade=true;
		for (int i = 0; i < empresa.empregados.length; i++) {
			
			f.salario = 1000+ 100*100;
			empresa.adiciona(f, i);
		}
		empresa.mostraEmpregado();
		System.out.println(empresa.contem(f));
	}

}

package Capitulo6;

public class MainEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.setEmpregados(new Funcionario[10]);
		Funcionario f = new Funcionario();
		f.setNome("Rogerio");
		f.setAtividade(true);
		for (int i = 0; i < empresa.getEmpregados().length; i++) {
			
			f.setSalario(1000+ i*100);
			empresa.adiciona(f, i);
		}
		empresa.mostraEmpregado();
		System.out.println(empresa.contem(f));
	}

}

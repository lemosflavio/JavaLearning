package Capitulo5;
public class Empresa {
	Funcionario[] empregados;
	String cnpj;

	void adiciona(Funcionario f, int x) {
		if (empregados[x] == null) {
			empregados[x] = f;
		}
	}

	void mostraEmpregado() {
		for (int i = 0; i < empregados.length; i++) {
			empregados[i].mostra();
		}
	}

	boolean contem(Funcionario f) {
		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i].nome == f.nome) {
				if (f.atividade == true) {
					return true;
				}
			}
		}
		return false;
	}

}

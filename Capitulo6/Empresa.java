package Capitulo6;

public class Empresa {
	private Funcionario[] empregados;
	private String cnpj;
	
	public Empresa(){
		
	}

	public Funcionario[] getEmpregados() {
		return this.empregados;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

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
			if (empregados[i].getNome() == f.getNome()) {
				if (f.getAtividade() == true) {
					return true;
				}
			}
		}
		return false;
	}

}

package Capitulo6;

public class Funcionario {
	private String nome, departamento, rg;
	private Data dataEntrada;
	private double salario;
	private boolean atividade;
	private int identificador;

	public Funcionario() {

	}

	public Funcionario(String nome) {

	}

	public double bonifica(double aumento) {
		salario = aumento * salario;
		return salario;
	}

	public boolean demite() {
		atividade = false;
		return atividade;
	}

	public void mostra() {
		System.out.println("Nome: " + nome);
		/*
		 * System.out.println("Departamento: "+departamento);
		 * System.out.println(
		 * "Data de Entrada: "+dataEntrada.dia+"/"+dataEntrada
		 * .mes+"/"+dataEntrada.ano); System.out.println("RG: "+rg);
		 */
		// System.out.println("Salario: "+salario);
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public double getSalario() {
		return this.salario;
	}

	public String getNome() {
		return this.nome;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public String getRg() {
		return this.rg;
	}

	public Data getDataEntrada() {
		return this.dataEntrada;
	}

	public boolean getAtividade() {
		return this.atividade;
	}

	public void setIdentificador(int x) {
		for (int i = 0; i < x; i++) {
			this.identificador = i + 1;
		}
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public void setAtividade(boolean atividade) {
		this.atividade = atividade;
	}

}

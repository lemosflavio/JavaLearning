package Capitulo5;
public class Funcionario {
	String nome, departamento, rg;
	Data dataEntrada;
	double salario;
	boolean atividade;
	
	double bonifica(double aumento){
		salario= aumento * salario;
		return salario;
	}
	
	boolean demite(){
		atividade = false;
		return atividade;
	}
	void mostra(){
		System.out.println("Nome: "+nome);
		/*System.out.println("Departamento: "+departamento);
		System.out.println("Data de Entrada: "+dataEntrada.dia+"/"+dataEntrada.mes+"/"+dataEntrada.ano);
		System.out.println("RG: "+rg);*/
		//System.out.println("Salario: "+salario);
	}
	
}

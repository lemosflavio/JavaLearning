package Capitulo10;

class GerenciadorDeImpostoDeRenda {
	private double total;

	void adiciona(ITributavel t) {
		System.out.println("Adicionando tributavel: " + t.calculaTributos());
		this.total += t.calculaTributos();
	}

	public double getTotal() {
		return this.total;
	}
}
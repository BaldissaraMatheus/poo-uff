package listaDeExercicios.exercicio3.produto;

public abstract class Produto {
	private String nome;
	private int preco;
	private int codigoDeBarras;

	public Produto(int codigoDeBarras, String nome, int preco) {
		this.codigoDeBarras = codigoDeBarras;
		this.nome = nome;
		this.preco = preco;
	}

	public int getCodigoDeBarras() {
		return this.codigoDeBarras;
	}

	public int getPreco() {
		return this.preco;
	}

	public boolean equals(Produto produto) {
		return produto.getCodigoDeBarras() == this.codigoDeBarras;
	}

	public String toString() {
		return "Nome: " + this.nome
				+ ", Código de barras: " + this.codigoDeBarras
				+ ", Preço: R$" + this.preco;
	}
}
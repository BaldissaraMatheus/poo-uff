package listaDeExercicios.exercicio3.produto;

public abstract class Produto {
	  protected int codigoDeBarras;
	  protected int preco;

	  public Produto(int codigoDeBarras, int preco) {
	    this.codigoDeBarras = codigoDeBarras;
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
	    return 
	      "Código de barras: " + this.getCodigoDeBarras()
	      + ", Preço: R$" + this.getPreco();
	  }
	}
package listaDeExercicios.exercicio3.produto;

public class Livro extends Produto {
	  private String autor;

	  public Livro(int codigoDeBarras, int preco, String autor) {
	    super(codigoDeBarras, preco);
	    this.autor = autor;
	  }

	  public String getAutor() {
	    return this.autor;
	  }

	  public String toString() {
	    return 
	      super.toString()
	      + ", Autor: " + this.getAutor();
	  }
	}
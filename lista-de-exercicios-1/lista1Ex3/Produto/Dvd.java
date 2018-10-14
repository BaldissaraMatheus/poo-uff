package lista1ex3.produto;

public class Dvd extends Produto {
  private int duracao;

  public Dvd(int codigoDeBarras, int preco, int duracao) {
    super(codigoDeBarras, preco);
    this.duracao = duracao;
  }

  public int getDuracao() {
    return this.duracao;
  }

  public String toString() {
    return 
      super.toString()
      + ", Duração (minutos): " + this.getDuracao();
  }
}
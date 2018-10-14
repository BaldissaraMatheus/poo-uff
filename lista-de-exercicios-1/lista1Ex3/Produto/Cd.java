package lista1ex3.produto;

public class Cd extends Produto {
  private int numFaixas;

  public Cd(int codigoDeBarras, int preco, int numFaixas) {
    super(codigoDeBarras, preco);
    this.numFaixas = numFaixas;
  }

  public int getNumFaixas() {
    return this.numFaixas;
  }

  public String toString() {
    return 
      super.toString()
      + ", Número de faixas: " + this.getNumFaixas();
  }
}
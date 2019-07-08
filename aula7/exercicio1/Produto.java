package aula7.exercicio1;

public class Produto {
  private int preco;
  private int estoque;

  public Produto(int preco, int estoque) {
    this.preco = preco;
    this.estoque = estoque;
  }

  public int getPreco() {
    return this.preco;
  }

  public int removeEstoque(int quantidade) {
    this.estoque -= quantidade;
    return estoque;
  }
}
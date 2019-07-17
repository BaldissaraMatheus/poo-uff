package aula7.exercicio1;

public class Produto {
  private int preco;
  private int quantidadeEmEstoque;

  public Produto(int preco, int quantidade) {
    this.preco = preco;
    this.quantidadeEmEstoque = quantidade;
  }

  public int getPreco() {
    return this.preco;
  }

  public int getQuantidadeEmEstoque() {
	  return this.quantidadeEmEstoque;
  }
  
  public int removeEstoque(int quantidade) {
    this.quantidadeEmEstoque -= quantidade;
    return quantidadeEmEstoque;
  }
}
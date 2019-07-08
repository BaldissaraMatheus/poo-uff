package aula7.exercicio1;

public class Item {
  private Produto produto;
  private int preco;
  private int quantidade;

  public Item(Produto produto, int quantidade) {
    this.produto = produto;
    this.quantidade = quantidade;
    this.preco = produto.getPreco() * quantidade;
    produto.removeEstoque(quantidade);
  }

  public int getPreco() {
    return this.preco;
  }

}
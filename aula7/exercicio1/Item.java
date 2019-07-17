package aula7.exercicio1;

public class Item {
  private Produto produto;
  private int quantidade;

  public Item(Produto produto, int quantidade) {
	  if (quantidade > produto.getQuantidadeEmEstoque()) {
		  throw new RuntimeException("Produto fora de estoque!");
	  }
	  
    this.produto = produto;
    this.quantidade = quantidade;
    produto.removeEstoque(quantidade);
  }

  public int getPreco() {
    return this.produto.getPreco() * this.quantidade;
  }
}
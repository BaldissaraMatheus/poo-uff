package aula7ex1package;

public class Pedido {
  private Item itens[];
  private int topo;
  private int precoTotal;

  public Pedido() {
    topo = 0;
    this.itens = new Item[100];
    this.precoTotal = 0;      
  }

  public void adicionaItem(Item item) {
    this.itens[topo] = item;
    this.precoTotal = this.precoTotal + item.getPreco();
  }

  public int getPreco() {
    return this.precoTotal;
  }
}
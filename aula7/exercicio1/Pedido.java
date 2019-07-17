package aula7.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
  private List<Item> itens;

  public Pedido() {
    this.itens = new ArrayList<>();     
  }

  public void adicionaItem(Item item) {
    this.itens.add(item);
  }

  public int getPreco() {
    int precoTotal = 0;
    
    for (Item item : itens) {
		precoTotal += item.getPreco();
	}
    
    return precoTotal;
  }
}
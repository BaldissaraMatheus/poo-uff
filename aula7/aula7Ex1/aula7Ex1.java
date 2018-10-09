package aula7ex1package;

public class aula7Ex1 {
  public static void main(String[] args) {

    Produto melancia = new Produto(1,20);
    Produto pera = new Produto(2, 10);
    
    Item item1 = new Item(melancia, 2);
    Item item2 = new Item(pera, 4);

    Pedido pedido = new Pedido();
    pedido.adicionaItem(item1);
    pedido.adicionaItem(item2);    
    
    System.out.println("Preço total: R$" + pedido.getPreco());
  }
}
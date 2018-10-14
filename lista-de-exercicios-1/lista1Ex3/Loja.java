package lista1ex3;

import lista1ex3.produto.*;

public class Loja {  

  public static void procuraProduto(Produto produtos[], Produto produto, int len) {
    for (int i=0; i<len; i++) {
      if (produtos[i].equals(produto)) {
        System.out.println("Produto encontrado na posição " + i);
        return;
      }
    }
    System.out.println("Produto não encontrado!");    
  }

  public static void main(String[] args) { 
    int TMAX = 5;
    Produto produtos[] = new Produto[TMAX];

    Livro livro1 = new Livro(0, 20, "George R. R. Martin");
    Livro livro2 = new Livro(1, 30, "George Orwell");
    Cd cd1 = new Cd(2, 50, 12);
    Cd cd2 = new Cd(3, 60, 10);
    Dvd dvd1 = new Dvd(4, 25, 45);    

    produtos[0] = livro1;
    produtos[1] = livro2;
    produtos[2] = cd1;
    produtos[3] = cd2;
    produtos[4] = dvd1;

    for (int i=0; i<TMAX; i++) {
      System.out.println(produtos[i]);
    }

    Dvd dvd2 = new Dvd(4, 25, 45);
    Dvd dvd3 = new Dvd(10, 25, 45);

    procuraProduto(produtos, dvd2, TMAX);
    procuraProduto(produtos, dvd3, TMAX);
  }
}


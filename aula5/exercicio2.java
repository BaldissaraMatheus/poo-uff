package aula5;
import java.util.Scanner;

public class exercicio2 {

  public static void listaNotas(int len) {
    int notas[] = new int[len];

    Scanner sc = new Scanner(System.in);
    
    for (int i=0; i<len; i++) {
      System.out.println("Digite a nota " + (i+1));
      notas[i] = sc.nextInt();
    }

    sc.close();

    System.out.print("Notas: ");
    for (int i=0; i<len; i++) {      
      System.out.print(notas[i] + " ");
    }
  }

  public static void main(String[] args) {
    int tamanho = 5;

    listaNotas(tamanho);
  }
}

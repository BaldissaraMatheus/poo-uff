import java.util.Scanner;

public class aula5Ex1 {

  public static void listaPessoas(int len) {
    String nomes[] = new String[len];
    int idades[] = new int[len];

    Scanner scStr = new Scanner(System.in);
    Scanner scInt = new Scanner(System.in);
    
    for (int i=0; i<len; i++) {
      System.out.println("Digite o nome " + (i+1));
      nomes[i] = scStr.nextLine();
      System.out.println("Digite a idade " + (i+1));
      idades[i] = scInt.nextInt();
    }

    scStr.close();
    scInt.close();

    for (int i=0; i<len; i++) {
      for (int j=i+1; j<len; j++) {
        if (nomes[i].compareTo(nomes[j])>0) {
          String tempStr = nomes[i];
          nomes[i] = nomes[j];
          nomes[j] = tempStr;

          int tempInt = idades[i];
          idades[i] = idades[j];
          idades[j] = tempInt;
        }
      }
    }

    for (int i=0; i<len; i++) {
      System.out.println(nomes[i] +" tem " + idades[i] + " anos!");
    }
  }

  public static void main(String[] args) {
    int tamanho = 20;

    listaPessoas(tamanho);
  }
}

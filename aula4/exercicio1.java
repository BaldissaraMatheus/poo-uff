package aula4;
import java.lang.Math;

public class exercicio1 {

  public static void listaDivisoresSimples(int num) {
    boolean primo = true;

    for (int i=2; i<num; i++) {
      if (num%i == 0) {
        System.out.println(i);
        primo = false;
  
      }
    }

    if (primo == true) {
      System.out.println("O número é primo");
    }
  }

  public static void listaDivisoresEficiente(int num) {
    int limite = (int)Math.sqrt(num);
    boolean primo = true;

    for (int i=2; i<=limite; i++) {
      if (num%i == 0) {
        System.out.println(i);
        primo = false;

        if (i != num/i) {
          System.out.println(num/i);
        }
  
      }
    }

    if (primo == true) {
      System.out.println("O número é primo");
    }
  }

  public static void main(String[] args) {
    int num = 12;

    // listaDivisoresEficiente(num);
    // listaDivisoresSimples(num);
  }
}


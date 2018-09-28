import java.lang.Math;

public class aula4Ex1 {

  public static void listaDivisores(int num) {
    int limite = (int)Math.sqrt(num);
    int primo = 0;

    for (int i=1; i<=limite; i++) {
      if (num%i == 0) {
        System.out.println(i);
        primo += 1;

        if (i != num/i) {
          System.out.println(num/i);
          primo += 1;
        }
  
      }
    }

    if (primo <= 2) {
      System.out.println("O número é primo");
    }
  }


  public static void main(String[] args) {
    // listaDivisores(31);
  }
}


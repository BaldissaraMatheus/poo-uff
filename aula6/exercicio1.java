package aula6;
import java.util.Scanner;

public class exercicio1 {

  private static Scanner scanner;

  public static int soma(int n1) {
    scanner = new Scanner(System.in);

    System.out.print(n1 + " + ");
    int n2 = scanner.nextInt();

    return n1 + n2;
  }

  public static int subtrai(int n1) {
    scanner = new Scanner(System.in);

    System.out.print(n1 + " - ");
    int n2 = scanner.nextInt();

    return n1 - n2;
  }

  public static int multiplica(int n1) {
    scanner = new Scanner(System.in);

    System.out.print(n1 + " * ");
    int n2 = scanner.nextInt();

    return n1 * n2;
  }

  public static int divide(int n1) {
    scanner = new Scanner(System.in);

    System.out.print(n1 + "/");
    int n2 = scanner.nextInt();

    return n1 / n2;
  }

  public static int limpaMemoria() {
    return 0;
  }

  public static boolean saiDoPrograma() {
    scanner = new Scanner(System.in);

    System.out.println("Tem certeza de que deseja sair do programa?");
    String decisao = scanner.nextLine();

    if (decisao.toUpperCase().equals("SIM") || decisao.toUpperCase().equals("S") ) {
      return false;

    } else {
      return true;
      
    }
  }

  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    boolean continua = true;
    int memoria = 0;
    int operacao = 0;

    while (continua) {      

      System.out.println("Qual operação deseja realizar?");
      operacao = scanner.nextInt();      
  
      switch(operacao) {
        case 1: 
          memoria = soma(memoria);
          System.out.println("Memória = " + memoria);
          break;
  
        case 2: 
          memoria = subtrai(memoria);
          System.out.println("Memória = " + memoria);
          break;
        
        case 3: 
          memoria = multiplica(memoria);
          System.out.println("Memória = " + memoria);
          break;
        
        case 4: 
          memoria = divide(memoria);
          System.out.println("Memória = " + memoria);
          break;
  
        case 5: 
          memoria = limpaMemoria();
          System.out.println("Memória = " + memoria);
          break;
          
        case 6: 
          continua = saiDoPrograma();
          break;
  
        default:
          System.out.println("Essa opção é inválida!");
          break;
      }      

    }
  }
}
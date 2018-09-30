import java.util.Scanner;

public class aula4Ex5 {

  private static String[] recombinacao(String s1, String s2) {  
    if (s1.length() != s2.length())  {
      System.out.println("As strings devem ter o mesmo tamanho!");
      return null;
    }

    int pontoCorte = (int)(Math.random() * s1.length());

    String filho1 = s1.substring(0, pontoCorte) + s2.substring(pontoCorte, s2.length());
    String filho2 = s2.substring(0, pontoCorte) + s1.substring(pontoCorte, s1.length());

    return new String[] {filho1, filho2};
  }

  private static String mutacao(String str) {  
    String strMutada = str;
    String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    char randomChar = alfabeto.charAt((int)(Math.random() * alfabeto.length()));
    int posicao = (int)(Math.random() * str.length());

    strMutada = str.substring(0, posicao) + randomChar  + str.substring(posicao+1, str.length()); 

    return(strMutada);
  }


  public static void recombinacaoEmutacao(String s1, String s2, String s3, String s4) {
    String[] rec1 = recombinacao(s1, s2);
    String[] rec2 = recombinacao(s3, s4);

    System.out.println(mutacao(rec1[0]));
    System.out.println(mutacao(rec1[1]));
    System.out.println(mutacao(rec2[0]));
    System.out.println(mutacao(rec2[1]));
  }

  public static void main(String[] args) {
    String s1 = "Aurora";
    String s2 = "Aksnes";
    String s3 = "Silvio";
    String s4 = "Santos";

    recombinacaoEmutacao(s1, s2, s3, s4);
  }
}
package aula4;

public class exercicio5 {

  private static String[] recombinacao(String s1, String s2) {  
    if (s1.length() != s2.length())  {
      System.out.println("As strings devem ter o mesmo tamanho!");
      return null;
    }

    int pontoCorte = (int)(Math.random() * s1.length());

    String filho1 = s1.substring(0, pontoCorte) + s2.substring(pontoCorte, s2.length());
    String filho2 = s2.substring(0, pontoCorte) + s1.substring(pontoCorte, s1.length());

    return new String[] { filho1, filho2 };
  }

  private static String mutacao(String input) {  
    String output = input;
    String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    char caractereAleatorio = alfabeto.charAt((int)(Math.random() * alfabeto.length()));
    int posicao = (int)(Math.random() * input.length());

    output = input.substring(0, posicao) + caractereAleatorio  + input.substring(posicao+1, input.length()); 

    return(output);
  }


  public static void recombinacaoEmutacao(String s1, String s2, String s3, String s4) {
    String[] recombinacao1 = recombinacao(s1, s2);
    String[] recombinacao2 = recombinacao(s3, s4);

    System.out.println(mutacao(recombinacao1[0]));
    System.out.println(mutacao(recombinacao1[1]));
    System.out.println(mutacao(recombinacao2[0]));
    System.out.println(mutacao(recombinacao2[1]));
  }

  public static void main(String[] args) {
    String s1 = "Aurora";
    String s2 = "Aksnes";
    String s3 = "Billie";
    String s4 = "Eilish";

    recombinacaoEmutacao(s1, s2, s3, s4);
  }
}
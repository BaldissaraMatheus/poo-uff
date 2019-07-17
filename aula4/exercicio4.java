package aula4;

public class exercicio4 {

  public static void algoritmoGenetico(String s1, String s2) {   
    int pontoCorteS1 = (int)(Math.random() * s1.length()+1);
    int pontoCorteS2 = (int)(Math.random() * s2.length()+1);

    String filho1 = s1.substring(0, pontoCorteS1) + s2.substring(pontoCorteS2, s2.length());
    String filho2 = s2.substring(0, pontoCorteS2) + s1.substring(pontoCorteS1, s1.length());

    System.out.println(filho1);
    System.out.println(filho2);
  }

  public static void main(String[] args) {
    String s1 = "Toninho";
    String s2 = "Rodrigues";

    algoritmoGenetico(s1, s2);
  }
}
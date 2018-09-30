import java.util.Scanner;

public class aula4Ex3 {

  public static void imprimeIniciais(String nome) {   
    String iniciais = "";

    /* Conectores escrito com regular expressions para selecionar apenas
     os termos indicados, caso o contrário, nomes com 'DANIEL' sofreriam
     modificações não desejáveis */

    String conectores[] = {
      "\\b E\\b",
      "\\b DO\\b",
      "\\b DA\\b",
      "\\b DOS\\b",
      "\\b DAS\\b",
      "\\b DE\\b",
      "\\b DI\\b",
      "\\b DU\\b",
    };

    nome = nome.toUpperCase();

    for (int i=0; i<conectores.length; i++) {
      nome = nome.replaceAll(conectores[i], "");
    }

    int primeiraLetra = 0;

    for (int i = 0; i < nome.length() - 1 ; i++) {
      if (nome.charAt(i) == ' ') {
        iniciais = iniciais + nome.charAt(primeiraLetra);
        primeiraLetra = i + 1;   
      }
    }

    iniciais = iniciais + nome.charAt(primeiraLetra);

    System.out.println(iniciais);
  }

  public static void main(String[] args) {
    String nome = "Fausto Corrêa da Silva";
    imprimeIniciais(nome);
  }
}
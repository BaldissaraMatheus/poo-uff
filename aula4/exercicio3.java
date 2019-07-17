package aula4;
public class exercicio3 {

  public static void imprimeIniciais(String nome) {   
    String iniciais = "";
    nome = nome.toUpperCase();

    /* Conectores escritos com regular expressions para selecionar apenas
     os termos indicados, caso o contrário, nomes como 'DANIEL' sofreriam
     modificações indesejáveis */

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

    for (int i = 0; i < conectores.length; i++) {
      nome = nome.replaceAll(conectores[i], "");
    }

    int posicaoPrimeiroCaracterePalavra = 0;

    for (int i = 0; i < nome.length() - 1 ; i++) {
      if (nome.charAt(i) == ' ') {
        iniciais = iniciais + nome.charAt(posicaoPrimeiroCaracterePalavra);
        posicaoPrimeiroCaracterePalavra = i + 1;   
      }
    }

    iniciais = iniciais + nome.charAt(posicaoPrimeiroCaracterePalavra);

    System.out.println(iniciais);
  }

  public static void main(String[] args) {
    String nome = "Toninho Rodrigues";
    imprimeIniciais(nome);
  }
}

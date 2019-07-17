package aula5;
import java.util.Scanner;

public class exercicio1 {

	static Scanner scanner;
	
	public static void leEListaPessoas(int len) {
	    String nomes[] = new String[len];
	    int idades[] = new int[len];
	    
	    for (int i = 0; i < len; i++) {
	      nomes[i] = leNome(i);
	      idades[i] = leIdade(nomes[i]);
	    }
	    
	    listaPorOrdemAlfabetica(nomes, idades);
	    listaPorOrdemDeIdade(nomes, idades);
    
	}

	public static String leNome(int posicao) {
		scanner = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite o nome " + (posicao+1));
		nome = scanner.nextLine();
		
		return nome;
	}
	
	public static int leIdade(String nome) {
		scanner = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite a idade de " + nome);
		idade = scanner.nextInt();
		
		return idade;
	}
	
	public static void listaPorOrdemAlfabetica(String[] nomes, int[] idades) {
		System.out.println("Listando por ordem alfabética:");
	
	    for (int i = 0; i < nomes.length; i++) {
	    	for (int j = i + 1; j < nomes.length; j++) {
	    		if (nomes[i].compareTo(nomes[j]) > 0) {
	    			swap(nomes, i, j);
	    			swap(idades, i, j);
	    		}
	        }
	    }
    
	    lista(nomes, idades);
	}
  
	public static void listaPorOrdemDeIdade(String[] nomes, int[] idades) {
		System.out.println("Listando por ordem crescente de idade:");
	
	    for (int i = 0; i < nomes.length; i++) {
	    	for (int j = i + 1; j < nomes.length; j++) {
	    		if (idades[j] > idades[i]) {
	    			swap(nomes, i, j);
	    			swap(idades, i, j);
	    		}
	        }
	    }
    
    	lista(nomes, idades);
	}
  
	public static void lista(String[] nomes, int[] idades) {
	  for (int i = 0; i < nomes.length; i++) {
		  System.out.println(nomes[i] +" tem " + idades[i] + " anos!");
	  }
	  System.out.println();
	}
  
	public static void swap(String[] vetorDeNomes, int posicao1, int posicao2) {
	  String temp = vetorDeNomes[posicao1];
      vetorDeNomes[posicao1] = vetorDeNomes[posicao2];
      vetorDeNomes[posicao1] = temp;
	}
  
	public static void swap(int[] vetorDeIdades, int posicao1, int posicao2) {
	  int temp = vetorDeIdades[posicao1];
      vetorDeIdades[posicao1] = vetorDeIdades[posicao2];
      vetorDeIdades[posicao1] = temp;
	}
  
	public static void main(String[] args) {
	    int numeroDePessoas = 10;
	    leEListaPessoas(numeroDePessoas);
    
	}
}

package aula4;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio2 {
	
	public static void contaCaracteres(String input) {
		System.out.println("A palavra digitada tem " + input.length() + " caracteres");
	}
	
	public static String escreveEmMaiusculo(String input) {
		String uppercase = input.toUpperCase();
		System.out.println("Em maiúsculo: " + uppercase);
		return uppercase;
	}

	public static void verificaSeComecaComUni(String input) {
		if ((input.substring(0, 3)).equals("UNI")){
			System.out.println("A string começa com UNI!!!");
		} else {
			System.out.println("A string NÃO começa com UNI!!!");
		}
	}

	public static void verificaSeTerminaComRio(String input) {
		if ((input.substring((input.length()-3), input.length())).equals("RIO")) {
			System.out.println("A string termina com RIO!!!");
		} else {
			System.out.println("A string NÃO começa com RIO!!!");
		}		
	}

	public static void contaVogais(String input) {
		int numeroDeVogais = input.length() - input.replaceAll("A", "")
				.replaceAll("E", "").replaceAll("I", "")
				.replaceAll("O", "").replaceAll("U", "")
				.length();
		System.out.println("Número de vogais: " + numeroDeVogais);
	}

	public static void contaNumeros(String input) {
		int numerosContados = input.length() - input.replaceAll("0", "").replaceAll("1", "")
				.replaceAll("2", "").replaceAll("3", "").replaceAll("4", "")
				.replaceAll("5", "").replaceAll("6", "").replaceAll("7", "")
				.replaceAll("8", "").replaceAll("9", "")
				.length();
		System.out.println("Número de dígitos numéricos: " + numerosContados);
	}

	public static void contaVogaisFormaAlternativa(String input) {
		String palavraSemVogais = input;
		String vogais[] = new String[] { "A", "E", "I", "O", "U" };
		
		for (String vogal : Arrays.asList(vogais)) {
			palavraSemVogais = palavraSemVogais.replaceAll(vogal, "");
		}
		
		System.out.println("Número de vogais: " + (input.length() - palavraSemVogais.length()));
	}
	
	public static void contaNumerosFormaAlternativa(String input) {
		String palavraSemNumeros = input;
		Integer numeros[] = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		for (Integer numero : Arrays.asList(numeros)) {
			palavraSemNumeros = palavraSemNumeros.replaceAll(numero.toString(), "");
		}
		
		System.out.println("Número de dígitos numéricos: " + (input.length() - palavraSemNumeros.length()));
	}
	
	public static void verificaSeEhPalindrono(String input) {
		boolean palindrono = true;
		
		for (int i = 0; i < input.length()- 1 - i; i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				palindrono = false;
				break;
			}
		}
		
		if (palindrono) {
			System.out.println("É palíndrono!!!!!!");
			
		} else {
			System.out.println("Não é palíndrono!!!!!!");
		}
	}
	
	
	public static void main(String[] args) {

		System.out.print("Digite uma palavra bacana: ");
		Scanner sc = new Scanner(System.in);		
		String palavra = sc.nextLine();
		sc.close();

		contaCaracteres(palavra);
		
		palavra = escreveEmMaiusculo(palavra);
		
		contaVogais(palavra);
//		contaVogaisFormaAlternativa(palavra);

		verificaSeComecaComUni(palavra);

		verificaSeTerminaComRio(palavra);

		contaNumeros(palavra);
//		contaNumerosFormaAlternativa(palavra);

		verificaSeEhPalindrono(palavra);
	}	
}
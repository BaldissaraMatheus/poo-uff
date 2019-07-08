package aula4;
import java.util.Scanner;
import java.lang.*;

public class exercicio2 {
	
	public static String printUppercase(String input) {
		String uppercase = input.toUpperCase();
		System.out.println("Em maiúsculo: " + uppercase);
		return uppercase;
	}

	public static void verUni(String inputStr) {
		if ((inputStr.substring(0, 3)).equals("UNI")){
			System.out.println("A string começa com UNI!!!");
		} else {
			System.out.println("A string NÃO começa com UNI!!!");
		}
	}

	public static void verRio(String inputStr) {
		if ((inputStr.substring((inputStr.length()-3), inputStr.length())).equals("RIO")){
			System.out.println("A string termina com RIO!!!");
		} else {
			System.out.println("A string NÃO começa com RIO!!!");
		}		
	}

	public static void countVowels(String inputStr) {
		int count = inputStr.length() - inputStr.replaceAll("A", "").replaceAll("E", "").replaceAll("I", "").replaceAll("O", "").replaceAll("U", "").length();
		System.out.println("Número de vogais: " + count);
	}

	public static void countNumbers(String inputStr) {
		int count = inputStr.length() - inputStr.replaceAll("0", "").replaceAll("1", "").replaceAll("2", "").replaceAll("3", "").replaceAll("4", "").replaceAll("5", "").replaceAll("6", "").replaceAll("7", "").replaceAll("8", "").replaceAll("9", "").length();
		System.out.println("Número de dígitos numéricos: " + count);
	}

	public static void verPalindron(String inputStr) {
		int beg = 0;
		int end = inputStr.length()-1;

		while (beg < end) {
			String begStr = inputStr.substring(beg, beg+1);
			String endStr = inputStr.substring(end, end+1);

			if(begStr.equals(endStr)) {
				beg+=1;
				end-=1;

			} else {
				System.out.println("Não é palíndrono!!!");
				return;
			}
		}

		System.out.println("É palíndrono!!!");
	}

	public static void main(String[] args) {

		System.out.print("Digite uma palavra legal: ");
		Scanner sc = new Scanner(System.in);		
		String stringInput = sc.nextLine();

		// Imprime maiúsculo
		String stringOutput = printUppercase(stringInput);

		sc.close();

		// Imprime número de vogais
		countVowels(stringOutput);

		// Verifica se começa com UNI
		verUni(stringOutput);

		// Verifica se termina com RIO
		verRio(stringOutput);

		// Imprime número de dígitos numéricos
		countNumbers(stringOutput);

		// Verifica se é palíndrono
		verPalindron(stringOutput);
	}	
}
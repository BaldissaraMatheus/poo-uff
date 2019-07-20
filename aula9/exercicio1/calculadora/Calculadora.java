package aula9.exercicio1.calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
  private int memoria;

  public Calculadora() {
    this.memoria = 0;
  }

  private int leValor() {
	int input = 0;
	  
	try {
      System.out.println("Digite um número: ");
      Scanner sc = new Scanner(System.in);		
      input = sc.nextInt();
      sc.close();
		
	} catch(InputMismatchException e1) {
      System.out.println("ERRO: Valores não númericos não são aceitos como parâmetro.");
    }
	
	return input;
  }

  public int soma() {
    
      int num = this.leValor();  
      this.memoria = this.memoria + num;
      System.out.println("Memória = " + this.memoria);    
      
    return this.memoria;
  }

  public int subtrai() {
      int num = this.leValor();  
      this.memoria = this.memoria - num;
      System.out.println("Memória = " + this.memoria);        

    return this.memoria;
  }

  public int multiplica() {
      int num = this.leValor(); 
      this.memoria = this.memoria * num;
      System.out.println("Memória = " + this.memoria);    
      
      return this.memoria;
  }

  public int divide() {
	try {  
	  int num = this.leValor();
      this.memoria = this.memoria / num;
      System.out.println("Memória = " + this.memoria);    
      
    } catch(ArithmeticException e2) {
      System.out.println("ERRO: Não é possível realizar divisão por 0");
    }

    return this.memoria;
  }

  public void limpaMemoria() {
    this.memoria = 0;
    System.out.println("Memória = " + this.memoria);
  }
}
package aula9.exercicio1.calculadora;

import java.util.Scanner;

public class Calculadora {
  private int memoria;

  public Calculadora() {
    this.memoria = 0;
  }

  private String getParam() {
    System.out.println("Digite um número: ");
    Scanner sc = new Scanner(System.in);		
    String input = sc.next();

    return input;
  }

  public int soma() {
    try {
      int num = Integer.parseInt(this.getParam());  
      this.memoria = this.memoria + num;
      System.out.println("Memória = " + this.memoria);    
      
    } catch(NumberFormatException e1) {
      System.out.println("ERRO: Valores não númericos não são aceitos como parâmetro.");
    }

    return this.memoria;
  }

  public int subtrai() {
    try {
      int num = Integer.parseInt(this.getParam());  
      this.memoria = this.memoria - num;
      System.out.println("Memória = " + this.memoria);    
      
    } catch(NumberFormatException e1) {
      System.out.println("ERRO: Valores não númericos não são aceitos como parâmetro.");
    }

    return this.memoria;
  }

  public int multiplica() {
    try {
      int num = Integer.parseInt(this.getParam());  
      this.memoria = this.memoria * num;
      System.out.println("Memória = " + this.memoria);    
      
    } catch(NumberFormatException e1) {
      System.out.println("ERRO: Valores não númericos não são aceitos como parâmetro.");
    }

    return this.memoria;
  }

  public int divide() {
    try {
      int num = Integer.parseInt(this.getParam());  
      this.memoria = this.memoria / num;
      System.out.println("Memória = " + this.memoria);    
      
    } catch(NumberFormatException e1) {
      System.out.println("ERRO: Valores não númericos não são aceitos como parâmetro.");
    
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
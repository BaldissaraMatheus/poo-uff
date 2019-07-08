package aula9.exercicio1;

import aula9.exercicio1.calculadora.Calculadora;

public class exercicio1 {
  public static void main(String[] args) {
    
    Calculadora calc = new Calculadora();

    System.out.println("SOMA");
    calc.soma();
    System.out.println("DIVISÃO");
    calc.divide();
  }
}

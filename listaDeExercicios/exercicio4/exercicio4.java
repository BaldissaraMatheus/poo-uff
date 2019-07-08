package listaDeExercicios.exercicio4;

import listaDeExercicios.exercicio4.figurasGeometrica.quadrilatero.*;
import listaDeExercicios.exercicio4.figurasGeometrica.circulo.*;

public class exercicio4 {

  public static void main(String[] args) { 
    Quadrado quadrado = new Quadrado(4);
    Retangulo retangulo = new Retangulo(2, 4);
    Circulo circulo = new Circulo(4);

    System.out.println("Perímetro do quadrado: " + quadrado.calculaPerimetro());
    System.out.println("Área do quadrado: " + quadrado.calculaArea());
    System.out.println("Perímetro do retângulo: " + retangulo.calculaPerimetro());
    System.out.println("Área do retângulo: " + retangulo.calculaArea());
    System.out.println("Perímetro do círculo: " + circulo.calculaPerimetro());
    System.out.println("Área do círculo: " + circulo.calculaArea());
  }
}
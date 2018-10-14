package lista1ex4;

import lista1ex4.figurasgeometricas.Circulo;
import lista1ex4.figurasgeometricas.quatrilateros.Quadrado;
import lista1ex4.figurasgeometricas.quatrilateros.Retangulo;

public class lista1Ex4 {

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
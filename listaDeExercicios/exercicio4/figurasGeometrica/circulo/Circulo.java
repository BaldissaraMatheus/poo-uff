package listaDeExercicios.exercicio4.figurasGeometrica.circulo;

import listaDeExercicios.exercicio4.figurasGeometrica.FiguraGeometrica;

public class Circulo implements FiguraGeometrica {
	  private int raio;
	  
	  public Circulo(int raio) {
	    this.raio = raio;
	  }

	  public int calculaPerimetro() {
	    return (int)(this.raio * 2 * Math.PI);
	  }

	  public int calculaArea() {
	    return (int)(Math.PI * this.raio * this.raio);
	  }

	}
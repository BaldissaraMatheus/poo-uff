package listaDeExercicios.exercicio4.figurasGeometrica.quadrilatero;

import listaDeExercicios.exercicio4.figurasGeometrica.FiguraGeometrica;

public abstract class Quadrilatero implements FiguraGeometrica {
  protected int l1;
  protected int l2;
  protected int l3;
  protected int l4;

  public Quadrilatero(int l1, int l2, int l3, int l4) {
    this.l1 = l1;
    this.l2 = l2;
    this.l3 = l3;
    this.l4 = l4;
  }

  public int calculaPerimetro() {
    return this.l1 + this.l2 + this.l3 + this.l4;
  }

  public int calculaArea() {
    return l1 * l2;
  };
}

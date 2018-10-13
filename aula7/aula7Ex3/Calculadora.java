package aula7ex3package;

public class Calculadora {
  private int memoria;

  public Calculadora() {
    this.memoria = 0;
  }

  public int soma(int num) {
    this.memoria = this.memoria + num;
    System.out.println("Memória = " + this.memoria);
    
    return this.memoria;
  }

  public int subtrai(int num) {
    this.memoria = this.memoria - num;
    System.out.println("Memória = " + this.memoria);

    return this.memoria;
  }

  public int multiplica(int num) {
    this.memoria = this.memoria * num;
    System.out.println("Memória = " + this.memoria);

    return this.memoria;
  }

  public int divide(int num) {
    this.memoria = this.memoria / num;
    System.out.println("Memória = " + this.memoria);

    return this.memoria;
  }

  public void limpaMemoria() {
    this.memoria = 0;
    System.out.println("Memória = " + this.memoria);
  }
}
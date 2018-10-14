package lista1ex2.conta;

public class ContaCorrenteEspecial extends ContaCorrente {

  public void ContaCorrenteEspecial() {
    this.saldo = 0;
  }

  public int sacar(int valor) {
    if (this.saldo >= 20) {
      this.saldo -= valor;
      this.saldo *= 0.99;

    } else {
      System.out.println("Você precisa ter mais de 20 reais em conta para sacar!");
    }

    return this.saldo;
  }
}
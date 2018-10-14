package lista1ex2.conta;

public class ContaCorrente {
  protected int saldo;

  public void ContaCorrente() {
    this.saldo = 0;
  }

  public int depositar(int valor) {
    this.saldo += valor;
    return this.saldo;
  }

  public int sacar(int valor) {
    this.saldo -= valor;
    this.saldo *= 0.95;
    return this.saldo;
  }

  public int obterSaldo() {
    return this.saldo;
  }
}
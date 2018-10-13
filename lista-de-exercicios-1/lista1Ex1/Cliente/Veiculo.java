package lista1ex1.cliente;

public class Veiculo {
  private String placa;
  private String modelo;
  private int proprietarioId;

  protected Veiculo(String placa, String modelo, int proprietarioId) {
    this.placa = placa;
    this.modelo = modelo;
    this.proprietarioId = proprietarioId;
  }

  public String getPlaca() {
    return this.placa;
  }

  public String getModelo() {
    return this.modelo;
  }

  public int getProprietarioId() {
    return this.proprietarioId;
  }
}
package listaDeExercicios.exercicio1;

public class Veiculo {
  private String placa;
  private String modelo;
  private int proprietarioId;

  protected Veiculo(String placa, String modelo) {
    this.placa = placa;
    this.modelo = modelo;
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
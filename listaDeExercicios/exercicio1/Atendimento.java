package listaDeExercicios.exercicio1;

public class Atendimento {
  private int id;
  private int clienteId;
  private String clienteNome;
  private String veiculoPlaca;
  private String veiculoModelo;
  private String problema;
  private String solucao;

  protected Atendimento(int id, int clienteId, String clienteNome, Veiculo veiculo, String problema, String solucao) {
    this.id = id;
    this.clienteId = clienteId;
    this.clienteNome = clienteNome;
    this.veiculoPlaca = veiculo.getPlaca();
    this.veiculoModelo = veiculo.getModelo();
    this.problema = problema;
    this.solucao = solucao;
  }

  public int getId() {
    return this.id;
  }

  public String getProblema() {
    return this.problema;
  }

  public String getSolucao() {
    return this.solucao;
  }

}
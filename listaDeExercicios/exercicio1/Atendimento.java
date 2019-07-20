package listaDeExercicios.exercicio1;

public class Atendimento {
  private String clienteNome;
  private String veiculoPlaca;
  private String veiculoModelo;
  private String problema;
  private String solucao;

  protected Atendimento(String clienteNome, String veiculoModelo, String veiculoPlaca,
		  String problema, String solucao) {
    this.clienteNome = clienteNome;
    this.veiculoPlaca = veiculoPlaca;
    this.veiculoModelo = veiculoModelo;
    this.problema = problema;
    this.solucao = solucao;
  }

  	public String getProblema() {
  	return this.problema;
  	}

	public String getSolucao() {
	  return this.solucao;
	}

	public String getClienteNome() {
		return clienteNome;
	}
	
	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}
	
	public String getVeiculoPlaca() {
		return veiculoPlaca;
	}
	
	public void setVeiculoPlaca(String veiculoPlaca) {
		this.veiculoPlaca = veiculoPlaca;
	}
	
	public String getVeiculoModelo() {
		return veiculoModelo;
	}
	
	public void setVeiculoModelo(String veiculoModelo) {
		this.veiculoModelo = veiculoModelo;
	}
	
	public void setProblema(String problema) {
		this.problema = problema;
	}

}
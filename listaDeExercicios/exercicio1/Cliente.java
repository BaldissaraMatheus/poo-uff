package listaDeExercicios.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private String nome;
  private List<Veiculo> veiculos;
  private List<Atendimento> atendimentos;

  public Cliente(String nome) {
    this.nome = nome;  
    this.veiculos = new ArrayList<>();
    this.atendimentos = new ArrayList<>();
  }

  public String getNome() {
    return this.nome;
  }

  public List<Veiculo> getVeiculos() {
    return this.veiculos;
  }
  
  public void cadastraVeiculo(String placa, String modelo) {
    Veiculo veiculo = new Veiculo(placa, modelo);
    this.veiculos.add(veiculo);
  }
  
  public Veiculo getVeiculo(String placa) {
    	for(Veiculo veiculo : this.veiculos) {
    		if (veiculo.getPlaca().equals(placa))
    			return veiculo;
    	}   
    
    System.out.println("Veículo não encontrado!");
    return null;
  }

  public void removeVeiculo(String placa) {
	  for(Veiculo veiculo : this.veiculos) {
  		if (veiculo.getPlaca().equals(placa)) {
  			this.veiculos.remove(veiculo);
  			return;
  		}
	  }
	  
	  System.out.println("eículo não encontrado!");
  	} 

  public Atendimento cadastraAtendimento(String problema, String solucao, String placa) {
      Atendimento atendimento = new Atendimento(this.nome, this.getVeiculo(placa).getModelo(), placa ,problema, solucao);

      return atendimento; 
  }

  public List<Atendimento> getAtendimentos() {
	  return atendimentos;
  }
	
  public static Cliente buscaClientePorNome(List<Cliente> clientes, String nome) {
	  for (Cliente cliente : clientes) {
		  if (cliente.getNome().equals(nome)) {
			  return cliente;
		  }
	  }
	  return null;
  }

}
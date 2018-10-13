package lista1ex1.cliente;

public class Cliente {
  private int id;
  private int veiculosCount;
  private int atendimentosCount;
  private String nome;
  private Veiculo veiculos[];
  private Atendimento atendimentos[];
  public final int TMAX = 100;

  public Cliente(int id, String nome) {
    this.id = id;
    this.nome = nome;  
    this.veiculos = new Veiculo[TMAX];
    this.veiculosCount = 0;
    this.atendimentos = new Atendimento[TMAX];
    this.atendimentosCount = 0;
  }

  public int getId() {
    return this.id;
  }

  public String getNome() {
    return this.nome;
  }

  public Veiculo[] getVeiculos() {
    return this.veiculos;
  }
  
  public void cadastraVeiculo(String placa, String modelo) {
    Veiculo veiculo = new Veiculo(placa, modelo, this.id);
    
    this.veiculos[this.veiculosCount] = veiculo;
    this.veiculosCount++;
  }
  
  public Veiculo getVeiculo(String placa) {
    try {
      for (int i=0; this.veiculos[i].getPlaca().equals(placa); i++) {
        
        if (this.veiculos[i].getPlaca().equals(placa)) {
          return this.veiculos[i];
        }
      }       
    } catch (IndexOutOfBoundsException e1) {
      System.out.println("Não foi encontrado nenhum veículo com essa placa pertencente a este usuário");
    }
    
    return null;
  }

  public void removeVeiculo(String placa) {
    try {
      for (int i=0; this.veiculos[i].getPlaca() == placa; i++) {
        
        if (this.veiculos[i].getPlaca() == placa) {
          this.veiculos[i] = null;
  
          for (int j=0; j<this.veiculosCount-1; j++) {
            this.veiculos[j] = this.veiculos[j+1];
          }
  
          break;
        }
      }
      this.veiculosCount--;      
    
    } catch (IndexOutOfBoundsException e1) {
      System.out.println("Não foi encontrado nenhum veículo com essa placa pertencente a este usuário");
    }
  }

  public Atendimento cadastraAtendimento(String problema, String solucao, String placa) {
    try {
      Veiculo veiculo = this.getVeiculo(placa);
      Atendimento atendimento = new Atendimento(this.atendimentosCount, this.id, this.nome, this.getVeiculo(placa), problema, solucao);
  
      this.atendimentos[this.atendimentosCount] = atendimento;
      this.atendimentosCount++;

      return atendimento;

    } catch (IndexOutOfBoundsException e1) {
      System.out.println("Não foi encontrado nenhum veículo com essa placa pertencente a este usuário");
    }
    return null;    
  }

  public Atendimento getAtendimento(int atendimentoId) {
    try {
      for (int i=0; this.atendimentos[i].getId() == atendimentoId; i++) {
        
        if ((this.atendimentos[i].getId() == atendimentoId)) {
          return this.atendimentos[i];
        }
      }       
    } catch (IndexOutOfBoundsException e1) {
      System.out.println("Não foi encontrado nenhum veículo com essa placa pertencente a este usuário");
    }
    return null;
  }

  public void removeAtendimento(int atendimentoId) {
    try {
      for (int i=0; this.atendimentos[i].getId() == atendimentoId; i++) {
        
        if (this.atendimentos[i].getId() == atendimentoId) {
          this.atendimentos[i] = null;
  
          for (int j=0; j<this.atendimentosCount-1; j++) {
            this.atendimentos[j] = this.atendimentos[j+1];
          }
  
          break;
        }
      }
      this.atendimentosCount--;      
    
    } catch (IndexOutOfBoundsException e1) {
      System.out.println("Não foi encontrado nenhum veículo com essa placa pertencente a este usuário");
    }
  }

}
package listaDeExercicios.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio1 {  
  private static Scanner sc;

public static void main(String[] args) { 
    boolean continua = true;
    List<Cliente> clientes = new ArrayList<>();
    List<Atendimento> atendimentos = new ArrayList<>();
    
    
    String nome;
    String placa;
    String modelo;
    String problema;
    String solucao;

    while (continua) {
      System.out.println();
      System.out.println("O que deseja fazer?");
      System.out.println("0 - Cadastrar Cliente");
      System.out.println("1 - Cadastrar Veículo");
      System.out.println("2 - Cadastrar Atendimento");
      System.out.println("3 - Listar Atendimentos");
      System.out.println("4 - Sair do programa");

      sc = new Scanner(System.in);
      int escolha = 0;
      escolha = Integer.parseInt(sc.nextLine());

      switch (escolha) {

        case 0:                
          System.out.println("Digite o nome do novo cliente");                     
          nome = sc.nextLine();       
          
          clientes.add(new Cliente(nome));          
          System.out.println("[Nome: " + clientes.get(clientes.size()-1).getNome() + " - cadastrado com sucesso!");
          
          break;

        case 1:
    	  System.out.println("Digite o nome do cliente");
          nome = sc.nextLine();
          
          System.out.println("Digite a placa do veículo");
          placa = sc.nextLine();
          
          System.out.println("Digite o modelo do veículo");
          modelo = sc.nextLine();
          
          Cliente.buscaClientePorNome(clientes, nome).cadastraVeiculo(placa, modelo);
          
          break;

        case 2:
    	  System.out.println("Digite o nome do cliente");
          nome = sc.nextLine();
          
          System.out.println("Digite a placa do veículo");
          placa = sc.nextLine();
          
          System.out.println("Digite o problema apresentado");
          problema = sc.nextLine();
          
          System.out.println("Digite a solução realizada");
          solucao = sc.nextLine();
          
          atendimentos.add(Cliente.buscaClientePorNome(clientes, nome).cadastraAtendimento(problema, solucao, placa));                 
          
          break;  
        
        case 3:
          for (Atendimento atendimento : atendimentos) {
        	  System.out.println("Atendimento n" + atendimentos.indexOf(atendimento) 
        	  + ", problema: " + atendimento.getProblema() 
        	  + ", solução: " + atendimento.getSolucao());  
          }

          break;
        
        case 4:
          continua = false;
          break;
          
        default:
          System.out.println("Opção inválida");
          break;
      }
    }
  }
}
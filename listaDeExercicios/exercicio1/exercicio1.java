package listaDeExercicios.exercicio1;

import java.util.Scanner;

public class exercicio1 {  
  public static void main(String[] args) { 
    int TMAX = 100;
    boolean continua = true;
    int topoClientes = 0;
    int topoAtendimentos = 0;

    Cliente clientes[] = new Cliente[TMAX];
    Atendimento atendimentos[] = new Atendimento[TMAX];

    int cliente;
    String placa;
    String modelo;
    String problema;
    String solucao;

    while (continua) {
      System.out.println("---------------------");
      System.out.println("O que deseja fazer?");
      System.out.println("0 - Cadastrar Cliente");
      System.out.println("1 - Cadastrar Veículo");
      System.out.println("2 - Cadastrar Atendimento");
      System.out.println("3 - Listar Atendimentos");
      System.out.println("4 - Sair do programa");

      Scanner sc = new Scanner(System.in);
      int escolha = 0;
      escolha = Integer.parseInt(sc.nextLine());

      switch (escolha) {

        case 0:                
          System.out.println("Digite o nome do novo cliente");                     
          String nome = sc.nextLine();          
          clientes[topoClientes] = new Cliente(topoClientes, nome);          
          System.out.println("Cliente ID: " + clientes[topoClientes].getId() + ", Nome: " + clientes[topoClientes].getNome() + " - cadastrado com sucesso!");
          topoClientes++;
          break;

        case 1:    
          System.out.println("Digite o ID do proprietário do veículo");
          cliente = Integer.parseInt(sc.nextLine());
          System.out.println("Digite a placa do veículo");
          placa = sc.nextLine();
          System.out.println("Digite o modelo do veículo");
          modelo = sc.nextLine();
          clientes[cliente].cadastraVeiculo(placa, modelo);
          break;

        case 2:
          System.out.println("Digite o ID do cliente");
          cliente = Integer.parseInt(sc.nextLine());
          System.out.println("Digite a placa do veículo");
          placa = sc.nextLine();
          System.out.println("Digite o problema apresentado");
          problema = sc.nextLine();
          System.out.println("Digite a solução realizada");
          solucao = sc.nextLine();
          atendimentos[topoAtendimentos] = clientes[cliente].cadastraAtendimento(problema, solucao, placa);          
          topoAtendimentos++;         
          break;  
        
        case 3:
          for (int i=0; i<topoAtendimentos; i++) {
            System.out.println("Atendimento n" + atendimentos[i].getId() + ", problema: " + atendimentos[i].getProblema() + ", solução: " + atendimentos[i].getSolucao());
          }
          break;
        
        case 4:
          continua = false;
          
        default:
          System.out.println("Opção inválida");
          break;
      }
    }
  }
}
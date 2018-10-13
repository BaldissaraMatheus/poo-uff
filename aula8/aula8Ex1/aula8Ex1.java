package aula8ex1package;

public class aula8Ex1 {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Orora", 22);
    Pessoa p2 = new Pessoa("Fausto", 68);
    Pessoa p3 = new Pessoa("Laninha", 33);

    Agenda agenda = new Agenda();
    OrdenadorNome ordenadorNome = new OrdenadorNome();
    OrdenadorIdade ordenadorIdade = new OrdenadorIdade();

    System.out.println("----------------------");
    System.out.println("Agenda desordenada: ");

    agenda.adicionaPessoa(p1);
    agenda.adicionaPessoa(p2);
    agenda.adicionaPessoa(p3);
    agenda.imprimePessoas();
    System.out.println("----------------------");

    System.out.println("Agenda ordenada por nomes: ");
    agenda = ordenadorNome.ordena(agenda);
    agenda.imprimePessoas();
    System.out.println("----------------------");

    System.out.println("Agenda ordenada por idades: ");
    agenda = ordenadorIdade.ordena(agenda);
    agenda.imprimePessoas();
    System.out.println("----------------------");  
  }
}
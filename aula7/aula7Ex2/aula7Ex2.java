package aula7ex2package;

public class aula7Ex2 {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Orora", 22);
    Pessoa p2 = new Pessoa("Fausto", 68);
    Pessoa p3 = new Pessoa("Laninha", 33);

    Agenda agenda = new Agenda();

    agenda.adicionaPessoa(p1);
    agenda.adicionaPessoa(p2);
    agenda.adicionaPessoa(p3);
    agenda.imprimeNomes();
  }
}
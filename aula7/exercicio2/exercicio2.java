package aula7.exercicio2;

public class exercicio2 {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Orora", 22);
    Pessoa p2 = new Pessoa("Faustao", 68);
    Pessoa p3 = new Pessoa("Laninha", 33);

    Agenda agenda = new Agenda();

    agenda.adicionaPessoa(p1);
    agenda.adicionaPessoa(p2);
    agenda.adicionaPessoa(p3);
    agenda.imprimePessoas();
  }
}

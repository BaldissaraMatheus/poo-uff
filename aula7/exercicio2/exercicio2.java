package aula7.exercicio2;

public class exercicio2 {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Orora", 22);
    Pessoa p2 = new Pessoa("Bilie", 17);
    Pessoa p3 = new Pessoa("Lana", 33);

    Agenda agenda = new Agenda();

    agenda.adicionaPessoa(p1);
    agenda.adicionaPessoa(p2);
    agenda.adicionaPessoa(p3);
    agenda.imprimePessoas();
  }
}

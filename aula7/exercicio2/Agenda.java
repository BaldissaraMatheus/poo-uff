package aula7.exercicio2;

public class Agenda {
  private Pessoa pessoas[];
  private int topo;
  private int TMAX = 100;

  public Agenda() {
    this.pessoas = new Pessoa[TMAX];
    topo = 0;
  }

  public void adicionaPessoa(Pessoa pessoa) {
    if (topo < TMAX) {
      this.pessoas[this.topo] = pessoa;
      topo+=1;
      this.ordenaAgenda();
    }
  }

  public void ordenaAgenda() {
    for (int i=0; i<topo; i++) {
      for (int j=i+1; j<topo; j++) {
        if ((this.pessoas[i].getNome()).compareTo(this.pessoas[j].getNome())>0) {
          Pessoa temp = this.pessoas[i];
          this.pessoas[i] =  this.pessoas[j];
          this.pessoas[j] = temp;
        }
      }
    }
  }

  public void imprimePessoas() {
    for (int i=0; i<topo; i++) {
      System.out.println(this.pessoas[i].getNome() + ", " + this.pessoas[i].getIdade() + " anos");
    }
  }
}
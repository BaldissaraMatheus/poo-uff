package aula8.exercicio1.agenda;

import aula8.exercicio1.pessoa.Pessoa;

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
    }
  }

  public Pessoa[] getPessoas() {
    return this.pessoas;
  }

  public int getLen() {
    return topo;
  }

  public void setPessoas(Pessoa pessoas[]) {
    this.pessoas = pessoas;
  }

  public void imprimePessoas() {
    for (int i=0; i<topo; i++) {
      System.out.println(this.pessoas[i].getNome() + ", " + this.pessoas[i].getIdade() + " anos");
    }
  }
}
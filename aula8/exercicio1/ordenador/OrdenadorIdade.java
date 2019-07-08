package aula8.exercicio1.ordenador;

import aula8.exercicio1.agenda.Agenda;
import aula8.exercicio1.pessoa.Pessoa;

public class OrdenadorIdade extends Ordenador{

  public Agenda ordena(Agenda agenda) {
    int len = agenda.getLen();
    Pessoa pessoas[] = agenda.getPessoas();

    for (int i=0; i<len; i++) {
      for (int j=i+1; j<len; j++) {
        if (pessoas[i].getIdade() > pessoas[j].getIdade()) {
          Pessoa temp = pessoas[i];
          pessoas[i] =  pessoas[j];
          pessoas[j] = temp;
        }
      }
    }

    agenda.setPessoas(pessoas);
    return agenda;
  };
}
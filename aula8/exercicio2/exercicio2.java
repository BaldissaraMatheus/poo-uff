package aula8.exercicio2;

import aula8.exercicio2.animal.*;

public class exercicio2 {
  public static void main(String[] args) {
    Animal animais[] = new Animal[10];

    System.out.println("A revolução dos bicho:");
    animais[0] = new Cao();
    animais[1] = new Cao();
    animais[2] = new Cao();
    animais[3] = new Gato();
    animais[4] = new Gato();
    animais[5] = new Gato();
    animais[6] = new Pessoa();
    animais[7] = new Pessoa();
    animais[8] = new Pessoa();
    animais[9] = new Pessoa();

    for (int i=0; i<10; i++) {
      animais[i].fala();
    }
  }
}
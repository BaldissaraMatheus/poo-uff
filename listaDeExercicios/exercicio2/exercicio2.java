package listaDeExercicios.exercicio2;

import listaDeExercicios.exercicio2.conta.*;

public class exercicio2 {  
	  public static void main(String[] args) { 
	    ContaCorrente contaNormal = new ContaCorrente();
	    ContaCorrenteEspecial contaTop = new ContaCorrenteEspecial();

	    contaNormal.depositar(100);
	    contaTop.depositar(100);
	    
	    contaNormal.sacar(10);
	    contaTop.sacar(10);

	    System.out.println("Saldo da conta normal: " + contaNormal.obterSaldo());
	    System.out.println("Saldo da conta topppp: " + contaTop.obterSaldo());
	  }
	}

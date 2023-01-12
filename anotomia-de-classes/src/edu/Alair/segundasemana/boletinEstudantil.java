package edu.alair.segundasemana;

public class boletinEstudantil {
    public static void main(String[] args) {
		int mediaFinal = 2;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");
	}
}


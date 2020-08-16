package fr.okayo.factorielle.lanceur;

import java.util.Scanner;

import fr.okayo.factorielle.service.Service;

public class Factorielle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service();
			
		Scanner reader = new Scanner(System.in);
        System.out.print("Entrer un nombre: ");

        int nombre = reader.nextInt();

        System.out.println("La factorielle de " + nombre + " est " + service.calculFactorielle(nombre));
	}

}

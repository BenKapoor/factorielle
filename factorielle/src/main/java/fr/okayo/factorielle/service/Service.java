package fr.okayo.factorielle.service;

public class Service {
	
	public static int calculFactorielle(int nombre) {
		
		int factorielle = 1;
		if (nombre > 1) {
			for (int i = 2; i <= nombre; i++) {
				factorielle = factorielle * i;
			}
		}
		return factorielle;	
	}

}

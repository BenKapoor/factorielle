package fr.okayo.factorielle.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceTest {

	
	Service service = new Service();
	
	@Test
	public void testFactorielle() {

		assertEquals(2, service.calculFactorielle(2));
		assertEquals(6, service.calculFactorielle(3));
		assertEquals(24, service.calculFactorielle(4));
		assertEquals(3628800, service.calculFactorielle(10));
	}

}

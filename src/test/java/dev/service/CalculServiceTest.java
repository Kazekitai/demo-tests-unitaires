package dev.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException;
import service.CalculService;

import static org.assertj.core.api.Assertions.*;

public class CalculServiceTest {
	private static final Logger LOG = LoggerFactory.getLogger(CalculServiceTest.class);
	

	@Test
	public void testAdditionnerConforme() throws Exception {
		LOG.info("Etant donné, une instance de la classe CalculService");
		// TODO
		CalculService calcul = new CalculService();
		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4");
		// TODO
		String expression = "1+3+4";
		int sommeRetourne = calcul.additionner(expression);
		int sommeAttendue = 8;
		LOG.info("Alors j'obtiens le résultat 8");
		// TODO
		assertThat(sommeRetourne).isEqualTo(sommeAttendue);

	}
	
	@Test(expected=CalculException.class)
	public void testAdditionnerNonConforme() throws Exception {
		LOG.info("Etant donné, une instance de la classe CalculService");
		// TODO
		CalculService calcul = new CalculService();
		LOG.info("Lorsque j'évalue l'addition de l'expression 1+3+4");
		// TODO
		String expression = "";
		int sommeRetourne = calcul.additionner(expression);
		int sommeAttendue = 8;
		LOG.info("Alors j'obtiens le résultat 8");
		// TODO
		
		assertThat(sommeRetourne, is(sommeAttendue));

	}

}

package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.exception.CalculException;

public class CalculService {

	private static final Logger LOG = LoggerFactory.getLogger("logger1");

	public int additionner(String expression) {
		/*
		 * TODO Ajouter un log en niveau DEBUG affichant "Evaluation de l'expression
		 * <expression>".
		 */
		/* TODO par exemple "Evaluation de l'expression 1+4" */
		LOG.debug("Evaluation de l'expression " + expression);
		if (expression.isEmpty()) {
			throw new CalculException("erreur l'expression est vide");
		}
		String[] nbs = expression.split("\\+");
		if (nbs.length == 0) {
			throw new CalculException("erreur l'expression est invalide. Elle doit contenir des nombre séparé des +");
		}

		int sum = 0;
		for (int i = 0; i < nbs.length; i++) {
			sum += Integer.parseInt(nbs[i]);
		}
		return sum;
	}

}

package console;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import service.CalculService;

public class App {
	private Scanner scanner;
	private CalculService calculatrice;
	private static final Logger LOG = LoggerFactory.getLogger("logger1");

	public App(Scanner scanner, CalculService calculatrice) {
		this.scanner = scanner;
		this.calculatrice = calculatrice;
	}

	protected void afficherTitre() {
		LOG.debug("**** Application Calculatrice ****");
	}

	public void demarrer() {
		afficherTitre();
	}

	protected void evaluer(String expression) {
		int result = calculatrice.additionner(expression);
		LOG.debug(expression + "=" + result);
	}

}

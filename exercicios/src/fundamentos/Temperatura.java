package fundamentos;

public class Temperatura {

	public static void main(String[] args) {

		double fahrenheit = 79;
		final double AJUSTE = 32;
		final double FATOR = 5 / 9.0;
		double celsius = (fahrenheit - AJUSTE) * FATOR;

		System.out.println("O resultado é " + celsius + "°C.");

		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;

		System.out.println("O resultado é " + celsius + "°C.");
	}

}
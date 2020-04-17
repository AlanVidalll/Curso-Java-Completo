package fundamentos.operadores;

public class DesafioAritmetico {
	public static void main(String[] args) {


		double denA = 3 * 2;
		double numA = Math.pow(6 * (3 + 2), 2) / (denA);
		System.out.println(numA);

		double denB = 2;
		double numB = Math.pow((1 - 5) * (2 - 7) / denB, 2);
		System.out.println(numB);

		double superior = Math.pow(numA - numB, 3);
		double inferior = Math.pow(10, 3);// Math.pow(a, b)calcula a potencia, em a vc coloca o valor e b o valor aser elevado.

		System.out.println("O resultado é : " + superior / inferior);
	}
}

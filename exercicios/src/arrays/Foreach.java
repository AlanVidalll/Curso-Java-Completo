package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		double [] notas = {7.9,4.5,8.6,7.6};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
			
		}
		System.out.println();
		
		for(double nota : notas) {
			
			System.out.print(nota + " ");
		}
		
	}

}

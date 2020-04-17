package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {

		// trabalho terca (v ou F)
		// trabalho quinta (v ou F)

		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		System.out.println("comprou TV 50\"? " + comprouTV50);
		System.out.println("comprou TV 32\"? " + comprouTV32);
		System.out.println("comprou TV 32\"sorvete? " + comprouSorvete);
		
		
		
		System.out.println("Mais saudavel? " + !comprouSorvete);
                                
		
		

	}
}

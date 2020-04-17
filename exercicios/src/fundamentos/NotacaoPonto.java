package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");

		System.out.println(s);

		System.out.println("Alan".toUpperCase());

		String x = "Vidal".toUpperCase();
		System.out.println(x);

		String y = "Bom Dia X".replace("X", "ALAN").toUpperCase().concat("!!!");
		System.out.println(y);
		
		// tipos primitivos não tem operador "."
		int a = 3;
		System.out.println(a);
	}

}

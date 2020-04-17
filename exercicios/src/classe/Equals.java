package classe;


public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome  = "Alan Vidal";
		u1.email = "vidalll@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome  = "Alan Vidal";
		u2.email = "vidalll@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		//System.out.println(u2.equals(new Date()));
	}

}

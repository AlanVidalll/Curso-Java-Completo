package fundamentos.conversao;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);

		float b = (float) 1.122188888;// conversao explicita , ciente de perda de dados 
		System.out.println(b);
		
		int c = 4 ;
		byte d = (byte)c;// explicita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e; // explicita (CAST)
		System.out.println(f);
	}

}

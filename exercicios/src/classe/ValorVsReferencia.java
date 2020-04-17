package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data();
		Data d2 = d1; //Atribuiçaõ por refêrencia. (Objeto)
		
		d1.ano = 2025;
		
		System.out.println(d1.data());
		System.out.println(d2.data());
		
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.data());
		System.out.println(d2.data());
	}
	
	static void voltarDataParaValorPadrao (Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

}

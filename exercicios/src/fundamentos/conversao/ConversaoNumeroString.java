package fundamentos.conversao;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		int num2 =10000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
// as 3 maneiras fazem a mesma coisa , porem de escritas diferentes 
		
	}
}

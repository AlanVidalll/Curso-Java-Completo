package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data data1 = new Data();

		var data2 = new Data(31, 2, 2001);

		System.out.println("A data 1 �: " + data1.data());
		System.out.println("A data 2 �: " + data2.data());

	}

}

package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {//Contrutor
        
		/* aqui usamos o this para chamar outro contrutor, você  pode chamar um
		 * construtor dentro de um método que não seja estático.Nesse caso chamamos 
		 * o contrutor abaixo com this entre parentes e atribuindo o valores com a 
		 * quantidade que ele necessita, o que identifica o construtor e números 
		 * de parâmetros que ele corresponde!  */
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1,1,1970);
	}
	
	/* Aqui estamos usando o mesmo nome da variável da instaciada na classe e no 
	 * construtor, isso geraria conflitos de nomes, por isso podemos usar o this
	 * na variável de instância para identifica - la e acabar com esse conflito.*/
	
	Data(int dia,int mes,int ano){  // Construtor 
         this.dia = dia;
         this.mes = mes;
         this.ano = ano;
	}

	String data() {  // metodo de instância..
		
		/*a variável formato é uma variavel local, não pode ser acessada fora  do metódo, 
		 *no caso ela está como final o que torna ela uma constante. */
		final String formato = "%d/%d/%d.";
		return String.format(formato, dia, mes, ano);
	}
}

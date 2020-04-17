package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {//Contrutor
        
		/* aqui usamos o this para chamar outro contrutor, voc�  pode chamar um
		 * construtor dentro de um m�todo que n�o seja est�tico.Nesse caso chamamos 
		 * o contrutor abaixo com this entre parentes e atribuindo o valores com a 
		 * quantidade que ele necessita, o que identifica o construtor e n�meros 
		 * de par�metros que ele corresponde!  */
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1,1,1970);
	}
	
	/* Aqui estamos usando o mesmo nome da vari�vel da instaciada na classe e no 
	 * construtor, isso geraria conflitos de nomes, por isso podemos usar o this
	 * na vari�vel de inst�ncia para identifica - la e acabar com esse conflito.*/
	
	Data(int dia,int mes,int ano){  // Construtor 
         this.dia = dia;
         this.mes = mes;
         this.ano = ano;
	}

	String data() {  // metodo de inst�ncia..
		
		/*a vari�vel formato � uma variavel local, n�o pode ser acessada fora  do met�do, 
		 *no caso ela est� como final o que torna ela uma constante. */
		final String formato = "%d/%d/%d.";
		return String.format(formato, dia, mes, ano);
	}
}

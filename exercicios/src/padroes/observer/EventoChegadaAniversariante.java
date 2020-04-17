package padroes.observer;
import java.util.Date;


public class EventoChegadaAniversariante {

	private final Date momento;
	

	public EventoChegadaAniversariante(Date date) {
		this.momento = date;
	}


	public Date getMomento() {
		return momento;
	}
}

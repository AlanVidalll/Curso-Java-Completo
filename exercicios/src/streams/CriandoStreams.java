package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print  = System.out::print;
		Consumer<Integer> println  = System.out::println;
		
		Stream<String> langs = Stream.of("java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		String[] mainsLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		Stream.of(mainsLangs).forEach(print);
		Arrays.stream(mainsLangs).forEach(print);
		Arrays.stream(mainsLangs,1,3).forEach(print);
		//o indice 1 � incluso na impress�o o 3 n�o!!!
		
		List<String> outrasLangs = Arrays.asList("\nC ", "PHP ", "Kotlin\n");
		outrasLangs.forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		//Stream.generate(() -> "anbcghjc").forEach(print);//forma infinita sem ordena��o!
		Stream.iterate(0, n -> n+1).forEach(println);
		
		
	}
 

}

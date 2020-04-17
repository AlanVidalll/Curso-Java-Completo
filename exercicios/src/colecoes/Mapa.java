package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Alan");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "maria");
		usuarios.put(4, "monica");
		
		System.out.println(usuarios.size());// size retorna quantidades de elementos.
		System.out.println(usuarios.isEmpty());// retorna true ou false se a lista estibver vazia
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("maria"));
		
		System.out.println(usuarios.get(4));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4,"maria"));
		
		for(Integer chave : usuarios.keySet()) {
			
			System.out.println(chave);
		}
		
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());
			
			
		}
			}

}

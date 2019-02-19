import java.security.SecureRandom;

public class Limericks {

	public static void main(String[] args) {
		
		
		final String[] artigo = {"the", "a", "one", "some", "any"};
		final String[] substantivo = {"boy", "girl", "dog", "town", "car", "toy", "joy", "cowboy", "playboy", "soy", "earl", "pearl", "burl", "knurl",
				"swirl","log", "fog", "bog", "blog", "sandhog", "crown", "brown", "gown", "frown", "renown", "bar", "star", "scar", "guitar", "cigar", "czar", "tsar",
				"char", "bazar"};
		final String[] verbo = {"drove", "jumped", "ran", "walked", "skipped"};
		final String[] preposicao = {"to", "from", "over", "under", "on"};
		
		String[] limericks = new String[5];
		String[] rima = new String[5];
		
		SecureRandom aleatorio = new SecureRandom();
		
		rima[0] = substantivo[aleatorio.nextInt(substantivo.length)];
		
		do {
			
			rima[2] = substantivo[aleatorio.nextInt(substantivo.length)];
			
		}while(rima[0].substring(rima[0].length()-2, rima[0].length()).equals(rima[2].substring(rima[2].length()-2, rima[2].length())));
		
		for(int i = 1; i < rima.length; i+=3) {
			
			do {
				
				rima[i] = substantivo[aleatorio.nextInt(substantivo.length)];
				
			}while(!rima[0].substring(rima[0].length()-2, rima[0].length()).equals(rima[i].substring(rima[i].length()-2, rima[i].length())) || rima[i].equals(rima[i-1]));
			
		}
		
		do {
			
			rima[3] = substantivo[aleatorio.nextInt(substantivo.length)];
			
		}while(!rima[2].substring(rima[2].length()-2, rima[2].length()).equals(rima[3].substring(rima[3].length()-2, rima[3].length())));
		
		
		
		for(String a: rima) {
			System.out.println(a);
		}
		
		
			


	}

}

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
		String[] rima1 = new String[6];
		String[] rima2 = new String[4];
		
		SecureRandom aleatorio = new SecureRandom();
		
		rima1[0] = substantivo[aleatorio.nextInt(substantivo.length)];
		
		for(int i = 1; i < rima1.length; i++) {
			
			do {
				
				rima1[i] = substantivo[aleatorio.nextInt(substantivo.length)];
				
			}while(!rima1[i-1].substring(rima1[i-1].length()-2, rima1[i-1].length()).equals(rima1[i].substring(rima1[i].length()-2, rima1[i].length())) || rima1[i].equals(rima1[i-1]));
			
		}
		
		for(String a: rima1) {
			System.out.println(a);
		}
		
		
			


	}

}

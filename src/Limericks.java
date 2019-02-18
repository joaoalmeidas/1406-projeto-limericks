import java.security.SecureRandom;

public class Limericks {

	public static void main(String[] args) {
		
		
		final String[] artigo = {"the", "a", "one", "some", "any"};
		final String[] substantivo = {"boy", "girl", "dog", "town", "car", "toy", "joy", "cowboy", "playboy", "soy", "earl", "pearl", "burl",
				"log", "fog", "bog", "blog", "crown", "brown", "gown", "frown", "renown", "bar", "star", "scar", "guitar", "cigar", "czar", "tsar",
				"char", "bazar"};
		final String[] verbo = {"drove", "jumped", "ran", "walked", "skipped"};
		final String[] preposicao = {"to", "from", "over", "under", "on"};
		
		String[] limericks = new String[5];
		
		SecureRandom aleatorio = new SecureRandom();
		
		
		
			
		String frase = "";
		
		frase += artigo[aleatorio.nextInt(artigo.length)] + " ";
		frase = frase.substring(0, 1).toUpperCase() + frase.substring(1, frase.length());
		frase += substantivo[aleatorio.nextInt(substantivo.length)] + " ";
		frase += verbo[aleatorio.nextInt(verbo.length)] + " ";
		frase += preposicao[aleatorio.nextInt(preposicao.length)] + " ";
		frase += artigo[aleatorio.nextInt(artigo.length)] + " ";
		frase += substantivo[aleatorio.nextInt(substantivo.length)] + ",";
		
		limericks[0] = frase;
			
		
		System.out.println(limericks[0]);
		
		frase = "";
		frase += artigo[aleatorio.nextInt(artigo.length)] + " ";
		frase = frase.substring(0, 1).toUpperCase() + frase.substring(1, frase.length());
		frase += substantivo[aleatorio.nextInt(substantivo.length)] + " ";
		frase += verbo[aleatorio.nextInt(verbo.length)] + " ";
		frase += preposicao[aleatorio.nextInt(preposicao.length)] + " ";
		frase += artigo[aleatorio.nextInt(artigo.length)] + " ";
		frase += substantivo[aleatorio.nextInt(substantivo.length)] + ",";
		
		limericks[2] = frase;
		
		System.out.println(limericks[2]);

	}

}

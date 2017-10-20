package caesar;

public class CaesarCipher {

	private String alpha = "abcdefghijklmnopqrstuvwxyz";
	
	
	
	public String encode(String vanillaText, int key) {
		
		String chocolateText = "";
		
		/**
		System.out.println("Alpha length: " + alpha.length());
		System.out.println("Alpha first char: " + alpha.charAt(0));
		System.out.println("Alpha last char: " + alpha.charAt(alpha.length() - 1));
		
		
		for (int i = 0; i <= alpha.length() - 1; i++) {
			//alternate: i < alpha.length();
			
			System.out.println(alpha.charAt(i));
		}
		
		// delete the * / to activate 
		// */ //prints all of alpha per character, as well as first/last characters of alpha
		
		for (int i = 0; i<= vanillaText.length() - 1; i++) {
			
			System.out.println(alpha.indexOf(vanillaText.charAt(i)));
			chocolateText = chocolateText + alpha.charAt(alpha.indexOf(vanillaText.charAt(i) + key));
		}
		
		/**
		 * Each car that I need from vanillaText I find the index in alpha
		 * for example, reed A to look up index for A, get 0
		 * Add key to index and write to chocolateText
		 */
		
		
		return chocolateText;
		
	}

}

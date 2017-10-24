package caesar;

public class CaesarCipher {

	
	private String alpha = "1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:\"ZXCVBNM<>?";
	
	// "aBcDeFgHiJkLmNoPqRsTuVwXyZAbCdEfGhIjKlMnOpQrStUvWxYz 0123456789"
	// "abCDefGHijKLmnOPqrSTuvWXyzABcdEFghIJklMNopQRstUVwxYZ 0123456789"
	// "1234567890qwertyuiopasdfghjklzxcvbnm QWERTYUIOPASDFGHJKLZXCVBNM"
	// "1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:\"ZXCVBNM<>? "

	public String encode(String vanillaText, int key) {
		
		String chocolateText = "";
		Boolean liveUpdatingKey = false;
		int updatingKey = key;
		
		
		
		for (int i = 0; i<= vanillaText.length() - 1; i++) {
			
			System.out.println(alpha.indexOf(vanillaText.charAt(i)));
			if(vanillaText.charAt(i) != ' ') {
				chocolateText = chocolateText + alpha.charAt(Math.abs((alpha.indexOf(vanillaText.charAt(i)) + updatingKey) % alpha.length()));
			} else {
				chocolateText = chocolateText + " ";
				if (liveUpdatingKey == true) {
					updatingKey = updatingKey + key;
				}
			}
			
		}
	

		return chocolateText;
		
	}

}

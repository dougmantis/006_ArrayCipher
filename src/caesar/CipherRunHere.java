package caesar;

import javax.swing.JOptionPane;

public class CipherRunHere {

	
	
	public static void main(String[] args) {
		
		String vanillaText;
		String chocolateText;
		int key = 1;
		
		CaesarCipher activeCipher = new CaesarCipher();
		
		vanillaText = JOptionPane.showInputDialog("Enter text to encode: ");
		
		do {
			try {
				key = Integer.valueOf(JOptionPane.showInputDialog("Enter encoding key: "));
				break;
			} catch (Exception err){
				JOptionPane.showMessageDialog(null, "Warning! " + err + "... Key must be a whole number.");
			}
		} while (true); //proud of this
		
		
		chocolateText = activeCipher.encode(vanillaText, key, false);
		
		JOptionPane.showMessageDialog(null, "Encoded message: " + chocolateText);
		System.out.println(chocolateText);
	}

}

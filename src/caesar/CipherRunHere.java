package caesar;

import javax.swing.JOptionPane;

public class CipherRunHere {

	static Object[] selections = {"Encoder","Decoder", "Cracker", "None"};
	static Object[] LKSelections = {"Disabled","Enabled"};
	static String selection;
	
	public static void main(String[] args) {
		
		
		selection = (String) JOptionPane.showInputDialog(null, "Select a utility:", "Util select", JOptionPane.PLAIN_MESSAGE, null, selections, selection);
		
		if (selection.equals("Encoder") || selection.equals("Decoder")) {
			
			String LKSelection = (String) JOptionPane.showInputDialog(null, "LiveKey mode enabled?", "Mode select", JOptionPane.PLAIN_MESSAGE, null, LKSelections, selection);
			
			String vanillaText = "";
			String chocolateText;
			int key = 1;
			
			CaesarCipher activeCipher = new CaesarCipher();
			
			while (vanillaText.equals("")) {
				
				vanillaText = JOptionPane.showInputDialog("Enter text to encode: ");
			}
			
			do {
				try {
					key = Integer.valueOf(JOptionPane.showInputDialog("Enter key: "));
					
					if (selection.equals("Decoder") ) {
						key = -key;
					}
					
					break;
					
				} catch (Exception err){
					
					JOptionPane.showMessageDialog(null, "Warning! " + err + "... Key must be a whole number.");
				}
			} while (true); //proud of this
			
			
			
			if (LKSelection.equals("Enabled")) {
				chocolateText = activeCipher.encode(vanillaText, key, true);
			} else {
				chocolateText = activeCipher.encode(vanillaText, key, false);
			}
				
			JOptionPane.showMessageDialog(null, "Encoded message: " + chocolateText);
			System.out.println(chocolateText);
		} else if (selection.equals("Cracker")) {
			JOptionPane.showMessageDialog(null, "This bit doesn't work yet.");
		}
	}
}

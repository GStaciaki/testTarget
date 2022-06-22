package targetTest;

public class InverteString {

	public static String inverteString(String text) {
		
		char[] arrayText = text.toCharArray();
		
		text = "";
		
		for (int i = arrayText.length - 1; i >= 0; i--) {
			text += arrayText[i];
		}
		return text;
	}
}

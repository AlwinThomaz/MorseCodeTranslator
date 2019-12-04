package morsecode;

public class App {

	public static void main(String[] args) {
		Dictionary myDic = new Dictionary();

		myDic.fillEntries(".-", "A");
		myDic.fillEntries("-...", "B");
		myDic.fillEntries("-.-.", "C");
		myDic.fillEntries("-..", "D");
		myDic.fillEntries(".", "E");
		myDic.fillEntries("..-.", "F");
		myDic.fillEntries("--.", "G");
		myDic.fillEntries("....", "H");
		myDic.fillEntries("..", "I");
		myDic.fillEntries(".---", "J");
		myDic.fillEntries("-.-", "K");
		myDic.fillEntries(".-..", "L");
		myDic.fillEntries("--", "M");
		myDic.fillEntries("-.", "N");
		myDic.fillEntries("---", "O");
		myDic.fillEntries(".--.", "P");
		myDic.fillEntries("--.-", "Q");
		myDic.fillEntries(".-.", "R");
		myDic.fillEntries("...", "S");
		myDic.fillEntries("-", "T");
		myDic.fillEntries("..-", "U");
		myDic.fillEntries("...-", "V");
		myDic.fillEntries(".--", "W");
		myDic.fillEntries("-..-", "X");
		myDic.fillEntries("-.--", "Y");
		myDic.fillEntries("--..", "Z");
		myDic.fillEntries("-----", "0");
		myDic.fillEntries(".----", "1");
		myDic.fillEntries("..---", "2");
		myDic.fillEntries("...--", "3");
		myDic.fillEntries("....-", "4");
		myDic.fillEntries(".....", "5");
		myDic.fillEntries("-....", "6");
		myDic.fillEntries("--...", "7");
		myDic.fillEntries("---..", "8");
		myDic.fillEntries("----.", "9");
		myDic.fillEntries("/", " ");

		// myDic.getEntries();

		String message = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";

		String array1[] = message.split(" ");
		for (int i = 0; i < array1.length; i++) {

			if (myDic.containsKey(array1[i])) {

				System.out.print(myDic.getValue(array1[i]));
			}

		}

	}
}
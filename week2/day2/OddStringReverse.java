package week2.day2;

public class OddStringReverse {
	public static void main(String args[]) {
		String word = "I am a software tester";
		String[] sentence = word.split(" ");
		// System.out.println(sentence);
		for (int i = 0; i <= sentence.length - 1; i++) {
			if (i % 2 != 0) {
				char[] charArray = sentence[i].toCharArray();
				for (int j = charArray.length - 1; j >= 0; j--) {
					System.out.print(charArray[j]);

				}
				System.out.print(" ");
			} else {
				System.out.print(sentence[i]);
			}

		}

	}
}

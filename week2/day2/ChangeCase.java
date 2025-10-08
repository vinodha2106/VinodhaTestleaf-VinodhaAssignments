package week2.day2;

public class ChangeCase {

	public static void main(String[] args) {
		String name = "changeme";
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char name1 = charArray[i];
			if (i % 2 != 0) {
				name1 = Character.toUpperCase(name1);
				System.out.print(name1);
			} else {
				System.out.print(charArray[i]);
			}
		}

	}

}

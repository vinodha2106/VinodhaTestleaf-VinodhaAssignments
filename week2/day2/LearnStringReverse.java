package week2.day2;

public class LearnStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String instantiation
		String data = "Aviyu";
		char[] charArray = data.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.println(charArray[i]);
		}
	}

}

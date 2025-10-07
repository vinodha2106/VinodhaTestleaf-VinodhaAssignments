package week2.day2;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn Java basics as part of java sessions in java week1";
		int count = 0;
		String[] newText = text.split(" ");
		for (int i = 0; i < newText.length - 1; i++) {
			for (count = i+1; count < newText.length; count++) {
				if (newText[i].equals(newText[count])) {
					// newText[count] = " ";
					String text1 = newText[count];
					System.out.println("Duplicate word is: " + text1);
					System.out.println(text.replace(text1, " "));
				}
			}
		}

	}

}

package week2.day1;

public class LearnConditionalStatement {

	public static void main(String[] args) {
		int score = 67;
		if (score >= 90) {
			System.out.println("The student has scored Grade S");
		} else if (score >= 80) {
			System.out.println("The student has scored Grade A");
		} else if (score >= 70) {
			System.out.println("The student has scored Grade B");
		} else if (score >= 60) {
			System.out.println("The student has scored Grade C");
		} else {
			System.out.println("The student has scored Grade D");
		}
	}
}

package week3.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 4, 3, 2, 8, 6, 7 };
		Arrays.sort(numbers);
		int diffNum = 0;
		for (int i = 1; i < numbers.length - 1; i++) {
			if (numbers[diffNum] == i) {
				diffNum++;

			} else {
				System.out.println("Print missing number :" +i);
			}
		}

	}
}

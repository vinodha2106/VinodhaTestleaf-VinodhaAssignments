package week3.day3;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 2, 5, 7, 7, 5, 9, 2, 3 };
		
		//sort arrays
		Arrays.sort(num);
		boolean hasDup = false;
		System.out.println("Duplicate numbers: ");
		
		//To find duplicates 
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] == num[i + 1]) {
				System.out.print(num[i]);
				System.out.print(", ");
				hasDup = true;
			}
		}
		if (!hasDup) {
			System.out.println("No duplicates found");
		}
	}
}

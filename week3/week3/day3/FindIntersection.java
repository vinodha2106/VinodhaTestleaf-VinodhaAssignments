package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3, 2, 11, 4, 6, 7 };
		int[] b = { 1, 2, 8, 4, 9, 7 };
		
		//To store duplicate in array using list
		List<Integer> common = new ArrayList<>();

		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j <= b.length - 1; j++) {
				if (a[i] == b[j]) {
					common.add(a[i]);
					break;
				}
			}
		}
		System.out.println("Duplicate number is :" + common);
	}

}

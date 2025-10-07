package week2.day2;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // split()- to split the string with delimiters
		String name = "Testleaf teaches various Courses";
		String[] splitName = name.split(" ");
		// output is the reference id of local variable****
		System.out.println(splitName);

		//using space as split here the words got split into each line
		for (int i = 0; i < splitName.length; i++) {
			System.out.println(splitName[i]);
		}

	}

}

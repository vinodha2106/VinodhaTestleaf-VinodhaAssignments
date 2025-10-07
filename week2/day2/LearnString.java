package week2.day2;

public class LearnString {
	public static void main(String args[]) {
		// String literal
		String name = "Vinodha";
		// String instantiation
		String name1 = new String("BE CSE");
		// find the length of string value
		System.out.println("Count of Letters is " + name.length());
		System.out.println("Department is" + name1);
		String name2 = "VinoDha";
		// Find the values are same along with case sensitive, equals
		if (name.equals(name2)) {
			System.out.println("Both value is same using equal() method");
		} else {
			System.out.println("Both values are not equal, using equal method");
		}
		// find the values are same ,not the case sensitive ,equalIgnore() returns
		// boolean
		if (name.equalsIgnoreCase(name2)) {
			System.out.println("Both are same using equalignore() method");
		} else {
			System.out.println("Both names are not equal using equalignorecase");
		}
		// contains() - will check char is present , return type is boolean
		// it is a case sensitive
		// ctrl+2 will make the local variable
		// name.contains("i") click ctrl+2
		boolean cont = name.contains("i");
		System.out.println(cont);

		// .tocharAray()- convert the string to characters
		String data = "Aviyu";
		char[] charArray = data.toCharArray();
		// now this will print reverse string each character, remove "ln" in "println"
		// will give a reverse string
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.println(charArray[i]);
		}
		System.out.println("********");
		// to print in correct format for should from i=0 as initialization
		for (int i = 0; i <= charArray.length - 1; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		// charAt()- to find value start in the index
		// index value starts from 0
		System.out.println("index value of 3 is:" + data.charAt(3));

	}
}

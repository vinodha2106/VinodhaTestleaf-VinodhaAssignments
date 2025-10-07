package week2.day2;

public class LearnStringReplace {
	public static void main(String args[]) {
//replace is used to replace a single character
		String replaceValue = "Good Afternoon";
		String replacedValue = replaceValue.replace('o', '0');
		System.out.println(replacedValue);

		// replaceAll
		// This is used to replace all characters in string
		String newVar = "Hey123, GoodAfternoon";
		// its case sensitive, now a-z small letters will be replaced,
		// replace case wise,word wise
		// spaceWise
		// special character wise
		// [^ 0-9] is used which will retain numbers alone in the string , removes all
		// the other characters
		// this ^ can`t be used with a-z 
		String replaced = newVar.replaceAll("[a-z]", " 000");
		System.out.println(replaced);
// upper case() and lower case()
		System.out.println(replaceValue.toLowerCase());
		System.out.println(replaceValue.toUpperCase());
		
		
		
		
		
	}
}

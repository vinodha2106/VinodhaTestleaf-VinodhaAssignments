package week3.day3;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String [] name= {"Vino","Yuge","Aviyu"};
       System.out.println("Print the arrays");
       for(int i=0;i<name.length;i++) {
    	   System.out.println("Print names: " +name[i]);
       }
		
       //to find length of array starts from 1
       int length=name.length;
       System.out.println("Length of array " +length);
       
       //index starts from 0
       //to find the last index value
       System.out.println("last array value: " + name[length-1]);
       
       //find the first value
       
       System.out.println("First index value of array: " +name[0]);
       
       
       //to sort array in ascending
       Arrays.sort(name);
       System.out.println("Sort in ascending and print index 0 value :" +name[0]);
       
       for(int i=0;i<name.length;i++) {
    	   System.out.println(name[i]);
       }
	}

}

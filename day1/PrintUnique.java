package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Shobana";
		String output="";
		char[] ch=s.toCharArray();
		
		Set <Character> unique = new LinkedHashSet<Character>();
		
	for (Character i : ch) {
		
		if(!unique.add(i)) {
			output=output+i;
		}
		}
	System.out.println("Removed only duplicate character" +unique);
		System.out.println("Printed duplicate character:" +output);	
}

}


/*
/*
 * Problem
 * 
 * a) Take your name as input
 * b) Print all unique characters only (any order)
 * 
 * Input:  babu
 * Output: a u 
 * 
 */

/*
 * Psuedocode
 * 
 * a) Convert String to Character array
 * b) Create a new Set -> HashSet
 * c) Add each character to the Set and if it is already there, remove it
 * d) Finally, print the set
 * */
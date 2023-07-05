package week3.day1;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String companyName ="Google";
		String output ="";
		char[] charArray = companyName.toCharArray();
		
		Set <Character> dup = new LinkedHashSet<Character>();
		
		for (Character i : charArray) {
			if(!dup.add(i)) {
				output=output+i;
			}
			}
		System.out.println("Removed only duplicate character" +dup);
			System.out.println("Printed duplicate character:" +output);	
	}

}

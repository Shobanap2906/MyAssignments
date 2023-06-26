package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		
		String []arr=test.split(" ");
		
		for(int i=1;i<=arr.length;i++) {
			if(i%2!=0)
				System.out.print(arr[i-1]);
			else
				System.out.print(reverseString(arr[i-1]));
			System.out.print(" ");
		}
	}
	
	private static String reverseString(String str) {
		StringBuilder rev = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
			rev.append(str.charAt(i));
		return rev.toString();
	}

}


/*//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

	

			/* Pseudo Code:
			 
			 * Declare the input as Follow
		      		String test = "I am a software tester"; 
			a) split the words and have it in an array
			b) Traverse through each word (using loop)
			c) find the odd index within the loop (use mod operator)
			
			d)split the words and have it in an array
			
			e)print the even position words in reverse order using another loop (nested loop)
			f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).*/
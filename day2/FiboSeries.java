package week1.day2;

public class FiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int range=7, firstTerm=0,secondTerm=1;
		System.out.println("Fibo Series :" +firstTerm+" " +secondTerm);
		
for(int i=1;i<range;i++) {
		int sum=firstTerm+secondTerm;
		firstTerm=secondTerm;
		secondTerm=sum;
	
System.out.println(sum);
	}





	}
}


	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

	// Print first number
	
	// Iterate from 1 to the range
	
	// add first and second number assign to sum

	// Assign second number to the first number

	// Assign sum to the second number
	
	// print sum

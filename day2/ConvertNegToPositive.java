package week1.day2;

public class ConvertNegToPositive {

	public static void main(String[] args) {
		
		 int number = -40;
		 int newNum =number=number*(-1);
				
		 if(number<0){
			 System.out.println(" Negative number");
			 
		 }else if(newNum<0) {
			 System.out.println( " Postive Number");
		 }else {
			 
			 System.out.println("Therefore number is converted to positive" +newNum);
		 }

	}

}

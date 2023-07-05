package week3.day1;

public class LearnConstructor {

	int x;
	String s;
		
		public LearnConstructor() {
			System.out.println("Default constructor");
			
		}
		
	public LearnConstructor(int i,String m) {
		 x=i;
		 m=s;
		 System.out.println("Constructor:" +x);
		 System.out.println("Constructor:" +m);
		}
		public static void main(String[] args) {
			LearnConstructor obj = new LearnConstructor(12,"Shobana");
		
			
	}

}

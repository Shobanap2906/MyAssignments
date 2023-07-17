package week4.day3;

import org.testng.annotations.Test;

public class DependsOnMethods {

		@Test(enabled=true)
		public void createLead() {
		
			System.out.println("createLead");
		}
		@Test(dependsOnMethods="createLead")
		public void editLead() {
			System.out.println("editLead");
		}
		@Test
		public void deleteLead() {
			System.out.println("deleteLead");
		}
		@Test
		public void mergeLead() {
			System.out.println("mergeLead");
		}
		@Test
		public void duplicteLead() {
			System.out.println("duplicteLead");
		}


}

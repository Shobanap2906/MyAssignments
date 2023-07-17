package week4.day2;

import org.testng.annotations.Test;

public class LearnEnabled {
	@Test
	public void createLead(){
		System.out.println("createLead");
	}
	@Test(enabled=false)
	public void editLead(){
		System.out.println("editLead");
	}
	@Test(priority=-1,enabled=false)
	public void deleteLead(){
	System.out.println("deleteLead");
	}
	@Test
	public void duplicateLead(){
	System.out.println("duplicateLead");
	}
}

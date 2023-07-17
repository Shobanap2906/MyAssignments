package week4.day2;

import org.testng.annotations.Test;

public class LearnPriority {
	@Test(priority=2)
	public void createLead(){
		System.out.println("createLead");
	}
	@Test(priority=0)
	public void editLead(){
		System.out.println("editLead");
	}
	@Test(priority=-1)
	public void deleteLead(){
	System.out.println("deleteLead");
	}
	@Test(priority=-2)
	public void duplicateLead(){
	System.out.println("duplicateLead");
	}
}

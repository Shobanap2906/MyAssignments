package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		   driver.get("http://leaftaps.com/opentaps/control/login");
			
			driver.findElement(By.id("username")).sendKeys("demosalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			
			driver.findElement(By.linkText("Leads")).click();
		
			
			driver.findElement(By.linkText("Create Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shobana");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Shobana5880@gmail.com");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9384603745");
			driver.findElement(By.name("submitButton")).click();
			Thread.sleep(5000);
			driver.close();
	

	}

}

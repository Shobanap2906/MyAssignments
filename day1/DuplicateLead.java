package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shobana");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shobna");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Search of Job");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shobana5880@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();	
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shobna");
		driver.findElement(By.name("submitButton")).click();
		
		driver.getTitle();
		System.out.println("To get the current title of the page" + driver.getTitle());
	
	}

}

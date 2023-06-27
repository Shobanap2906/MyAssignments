package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Shobna");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Newsite");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("2000");
		
		WebElement chooseOption= driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select dropdown = new Select(chooseOption);
		dropdown.selectByIndex(3);
		
		WebElement chooseOption1=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
			Select dropdown1 =new Select(chooseOption1);
			dropdown1.selectByVisibleText("S-Corporation");
		   
			WebElement chooseOption2=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
			Select dropdown2 =new Select(chooseOption2);
			dropdown2.selectByValue("LEAD_EMPLOYEE");
		   
			WebElement chooseOption3=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
			Select dropdown3 =new Select(chooseOption3);
			dropdown3.selectByIndex(6);
			
			WebElement chooseOption4=driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
			Select dropdown4 =new Select(chooseOption4);
			dropdown4.selectByValue("TX");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}

}

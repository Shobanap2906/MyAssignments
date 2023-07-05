package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBusTestcase {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Bus")).click();
		driver.findElement(By.xpath("//input[@class='form-control border-0 mb-0 ui-autocomplete-input']")).sendKeys("Chennai");
	   driver.findElement(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']/li")).click();
	 driver.findElement(By.xpath("//div[@class='form-group mb-0']/input[@id='destination']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.linkText("10")).click();
		driver.findElement(By.linkText("Search")).click();
	WebElement navigate	=driver.findElement(By.xpath("//p[text()='VOLVO AC Multi Axle Semi Sleeper (2 + 2)']"));
	 System.out.println(navigate.getText());
	driver.findElement(By.id("Bustypes4")).click();
	WebElement navigate1	=driver.findElement(By.xpath("//p[text()='36 Seats Available']"));
	System.out.println(navigate1.getText());

	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
	
	driver.findElement(By.xpath("//a[@id='UO3-5ZZ']")).click();
	WebElement print = driver.findElement(By.xpath("//p[text()='Seats Selected ']"));
	System.out.println(print.getText());
	WebElement print1= driver.findElement(By.xpath("//span[text()='DU5']"));
	System.out.println(print1.getText());
	WebElement print2=driver.findElement(By.xpath("//p[text()='Total Fare']"));
	System.out.println(print2.getText());
	WebElement print3=driver.findElement(By.id("ticketfare"));
	System.out.println(print3.getText());
	
	
	WebElement boardingPoint = driver.findElement(By.xpath("//select[@class='dropdown_custom']"));
	Select board = new Select(boardingPoint);
	board.selectByValue("374^Sirsuri^09:30 PM^SIPCOT IT GATE^SIPCOT IT GATE,SIPCOT IT GATE^");
	WebElement droppingPoint = driver.findElement(By.xpath("(//select[@class='dropdown_custom'])[2]"));
	Select dropping = new Select(droppingPoint);
	dropping.selectByVisibleText("Electronic City Toll Gate-05:03");
	
	System.out.println(driver.getTitle());
	
	driver.close();

	}

}

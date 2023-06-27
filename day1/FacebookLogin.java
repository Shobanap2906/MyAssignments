package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Shobana");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("P");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9384603745");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Lakshitha@1706");
		
		
		WebElement selectDate = driver.findElement(By.name("birthday_day"));
		
		Select selectOption =new Select(selectDate);
		
		selectOption.selectByIndex(3);
		
		WebElement selectMonth = driver.findElement(By.id("month"));
		
		Select selectOption2 =new Select(selectMonth);
		
		selectOption2.selectByVisibleText("Jun");
		
		WebElement selectYear= driver.findElement(By.id("year"));
		
		Select selectOption3 =new Select(selectYear);
		
		selectOption3.selectByValue("2023");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	}

}

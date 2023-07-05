package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {

	    ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.leafground.com/alert.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//Simple
			
			driver.findElement(By.xpath("//span[text()='Show']")).click();
			Alert simple =driver.switchTo().alert();
			String text =simple.getText();
			System.out.println(text);
			simple.accept();
			
			//confirm
			driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
			Alert confirm =driver.switchTo().alert();
			confirm.dismiss();
			
			//dismiss
			driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
			driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
			
			//prompt
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();;
		
		Alert prompt = driver.switchTo().alert();
		
			String text2 =prompt.getText();
			System.out.println(text2);
			prompt.sendKeys("Shobana");
			prompt.accept();
			
			Thread.sleep(5000);
			
			//Sweet Alert (Simple Dialog)
			
			driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
			driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
			
			//Sweet Modal Dialog

			driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
			driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
			
			//Sweet Alert (Confirmation)
			driver.findElement(By.xpath("//span[text()='Delete']")).click();
			driver.findElement(By.xpath("//span[text()='No']")).click();
			
			//Minimize and Maximize
			driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
			
	}

}

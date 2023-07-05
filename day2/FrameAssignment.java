package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) {
		
		 ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.switchTo().frame("iframeResult");
			
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			
			Alert simple = driver.switchTo().alert();
			simple.accept();
			
			String text = driver.findElement(By.id("demo")).getText();
	        if (text.contains("Text clicked "))
	        {
	            System.out.println("Successfull");
	        }
			
			
		
	}

}

/*Load the url()
1) handle the frame 
  2)Click Try It button
  3)Pass a text in the alert and get the Text  and accept the alert
  4)Verify yor name is printed successfully
*/
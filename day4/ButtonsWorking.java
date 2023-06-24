package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");

		driver.findElement(By.id("j_idt88:name")).sendKeys("Shobana P");
		driver.findElement(By.name("j_idt88:j_idt91")).sendKeys("India");
		WebElement disable= driver.findElement(By.name("j_idt88:j_idt93"));
		System.out.println(disable.isEnabled());
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		String retrive =driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");

		 System.out.println(retrive);
		 
	WebElement tabKey = driver.findElement(By.id("j_idt88:j_idt99"));
	tabKey.sendKeys("Shobana5880@gmail.com");
	tabKey.sendKeys(Keys.TAB);
	driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I am Shobana P");
		//text editor-- driver.findElement(By.name("j_idt88:j_idt103_input")).sendKeys("Learning in Testleaf");
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
	WebElement labelPositionChange	= driver.findElement(By.id("j_idt106:float-input"));
	labelPositionChange.click();
	System.out.println(labelPositionChange);
	//Type your name and choose the third option
//WebElement chooseThird= driver.findElement(By.id("j_idt106:auto-complete"));
//chooseThird.sendKeys("Shobana");
//chooseThird.click();
	//driver.findElement(By.className("ui-button-icon-primary ui-icon ui-icon-triangle-1-s")).click();
	//driver.findElement(By.id("j_idt106:j_idt116")).sendKeys("29/06/1994");
	WebElement keyboardAppears = driver.findElement(By.id("j_idt106:j_idt122"));
	keyboardAppears.click();
	System.out.println(keyboardAppears);
	
	//Custom Toolbar 
	}

}

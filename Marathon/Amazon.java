package Marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
    ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		driver.findElement(By.xpath("//div[@class='s-suggestion-container']/div[@aria-label='bags for boys']")).click();
		WebElement print =	driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span"));
		System.out.println(print.getText());
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		WebElement dropdown = driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']"));
		dropdown.click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		WebElement dropdown1 = driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base'])[1]"));
		System.out.println(dropdown1.getText());
		System.out.println(driver.getTitle());
		
		//(//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-medium']/span)[9]
		//li[@aria-label='Skybags']
		
		}

}

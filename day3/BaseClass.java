package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public RemoteWebDriver driver;

	@BeforeMethod
	@Parameters({"browser","url" ,"username","password"})
	public void preCondition(String browser,String url,String uname,String pwd) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();	
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
	}

	@AfterMethod
	public void postCondition() {
	driver.close();
	
}}


package users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class first {

	@Test
	public void add() {
		
}
	
	@BeforeClass
	  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
	    driver.get("https://testjms-one.uk/gateway/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jmstest+04@noainfosolutions.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("a123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("logged in successfully");
		driver.findElement(By.xpath("//img[@src='/gateway/default/img/avatar.png']")).click();
		driver.findElement(By.xpath("//div[contains(text(), 'Multi Instance')]")).click();
		
}
}
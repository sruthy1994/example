package users;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class adduser {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
	    driver.get("https://testjms-one.uk/gateway/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jmstest+04@noainfosolutions.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("a123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//img[@src='/gateway/default/img/avatar.png']")).click();
	}

}

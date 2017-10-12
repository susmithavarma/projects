package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		    //driver.findElement(By.linkText("Sign In")).click();
		    driver.findElement(By.id("identifierId")).clear();
		    driver.findElement(By.id("identifierId")).sendKeys("susmithameesa25@gmail.com");
		
		    driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
		    Thread.sleep(2000);
		  
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("nishma27");
		    driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
	}

	
}


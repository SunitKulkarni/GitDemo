package testProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParlellTest {
	
	
	WebDriver driver = null;

	@Test
	public void test1() {
		System.out.println("I'm inside Test1");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Automation\\Testdrivers\\chromedriver.exe");        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	
	@Test
	public void test2() {
		System.out.println("I'm inside Test2");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Automation\\Testdrivers\\chromedriver.exe");        
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
	}
}

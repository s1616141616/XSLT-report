package buildTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBase {

	@Test
	public void Test_01() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	

	}

	@Test
	public void Test_02() {
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println(c);

	}

	@Test
	public void Test_03() {
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println(c);

	}
	
	@Test
	public void Test_04() {
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println(c);

	}
	
	@Test
	public void google() {
		
		WebDriver driver =new FirefoxDriver();
		
		driver.findElement(By.xpath("https://www.google.com"));
		
	}
	
	
}

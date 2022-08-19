package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstClass 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
	    
	  WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.Edgedriver","Edgedriver.exe" );
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://demoqa.com/automation-practice-form");
	    driver1.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Raghav");
	   
	    
		
		
		
	}
	

}

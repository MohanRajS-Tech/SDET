package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String name = "Mohan Raj S";
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		
//GIVING ALERT KNOWLEDGE TO SELENIUM

//sysout + ctrl + space
		System.out.println(driver.switchTo().alert().getText());
		//FOR ALL POSITIVE BUTTON
		driver.switchTo().alert().accept();
		
//OK & CANCEL BUTTON
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		//TO CLICK ON NEGATIVE BUTTON
		driver.switchTo().alert().dismiss();
		
		

	}

}

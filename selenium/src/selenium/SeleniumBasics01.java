package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello Selenium");
		
		//System.setProperty("webdriver.gecko.driver", "path");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.edge.driver", "path");
		//WebDriver driver = new EdgeDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/mohan/OneDrive/Documents/SDET/Drivers/chromedriver/chromedriver.exe");
		
		//invoking browser
		//for chrome- chromedriver class- methods
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		//To print the page Title
		System.out.println(driver.getTitle());
		
		//LOCATORS
		//id
		driver.findElement(By.id("my-text-id")).sendKeys("Text Input Section by ID Locators");
		//name
		driver.findElement(By.name("my-password")).sendKeys("Password Input by Nmae Locators");
		//class name
		
		//CSS-tagname.class , tagname#id , tagname[attribute="value"]
		driver.findElement(By.cssSelector("textarea[name='my-textarea']")).sendKeys("Text Area through CSS Selectors");
		//xpath
		driver.findElement(By.xpath("//option[@value='3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='my-datalist']")).sendKeys("New York");
		//driver.findElement(By.xpath("//input[@list='my-options']/parent::label/datalist/option[1]")).click();
		
		//UPLOAD FILE
		WebElement addfile = driver.findElement(By.xpath("//input[@type='file']"));
		addfile.sendKeys("C:/Users/mohan/Desktop/media/HD-Images/8.jpg");
		
		//Check Box
		driver.findElement(By.xpath("//input[@id='my-check-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='my-check-2']")).click();
		Thread.sleep(2000);
		
		//Radio Button
		driver.findElement(By.xpath("//input[@id='my-radio-1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='my-radio-2']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='my-colors']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='my-date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//th[@class='next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='1']")).click();
		
		Thread.sleep(2000);
		//REGULAR EXPRESSION CSS SELECTOR
		driver.findElement(By.cssSelector("button[class*='btn-outline-primary']")).click();
		
		System.out.println(driver.findElement(By.xpath("//h1[@class='display-6']")).getText());
		
		
		
		//linktext
		//customised CSS and Xpath
		//Xpath parent to chilD traverse
		//CSS based on regular expression
		//Tag name
		//Dynamic password getting
		//Xpath Sibling traverse
		//Xpath child to parent traverse

	}

}

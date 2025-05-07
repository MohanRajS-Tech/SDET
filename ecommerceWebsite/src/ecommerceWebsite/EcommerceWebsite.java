package ecommerceWebsite;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class EcommerceWebsite {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "path");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Declaring array
		String[] veglist = {"Cucumber","Tomato","Pumpkin"};
		//Convert array to arraylist ,as array needs only less memory we r using it for initial declaration
		List<String> items = Arrays.asList(veglist);
		//calling module to add veg to cart
		additem(driver,items);
		driver.findElement(By.cssSelector("img[alt=Cart]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		
		//EXPLICIT WAIT
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		
		//Verify if the coupon is applied
		String promo = driver.findElement(By.cssSelector("span[class='promoInfo']")).getText();
		Assert.assertEquals( promo , "Code applied ..!");
		
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();		
		
	}

	
	
	public static void additem(WebDriver driver,List<String> items) {
		
		int j = 0;
	
    //the goal is to check if name extracted is present in list or not
	
	//get the webelement list and iterate on it
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	
		for(int i=0 ;i<products.size();i++) {

		 	//String name = (products.get(i).getText().split(" "))[0];
		 	String[] name = products.get(i).getText().split("-");
		 	//format the name to get the name alone
		 	String formatedName = name[0].trim();
		 	
		 	if(items.contains(formatedName))
		 	{
		 		//CLICK ON ADD TO CART
		 		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		 		j++;
		 		if(j == items.size()) 
		 		{
		 			break;
		 		}
		 		
		 		
		 	}
		
	}

}
}
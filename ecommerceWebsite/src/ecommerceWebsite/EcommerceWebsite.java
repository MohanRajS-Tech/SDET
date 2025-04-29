package ecommerceWebsite;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class EcommerceWebsite {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "path");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Declaring array
		String[] veglist = {"Cucumber","Tomato","Pumpkin"};
		int j = 0;
		
		//the goal is to check if name extracted is present in list or not
		//Convert to arraylist ,as array needs only less memory
		List<String> items = Arrays.asList(veglist);
		
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
			 		if(j == veglist.length) {
			 			break;
			 		}
			 		
			 		
			 	}
		}

	}

}

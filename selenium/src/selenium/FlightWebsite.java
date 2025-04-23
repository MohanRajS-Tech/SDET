package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightWebsite {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Flight Website Project"+'\n');
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
/*		
		//STATIC DROPDOWN-options are fixed
		//with SELECT tag
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		//DROPDOWN + LOOPING
		System.out.println("\n"+ "No of Adults before loop");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		
		//WHILE LOOP
		int i =1;		
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println("\n"+ "No of Adults is");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
		//DYNAMIC DROPDOWN - The dropdown is loaded only after the section is selected
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='COK']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
*/			
		//PARENT TO CHILD RELATIONSHIP XPATH
		//ALTERNATE TO INDEXING
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='COK']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GOI']")).click();
		
		
		
		
		//AUTO SUGGESTIVE DROPDOWN
		//driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		//List<WebElement> options = driver.findElements(By.cssSelector("li[class*='ui'] a"));
		//for(WebElement option : options)
		//{
		//	if(option.getText().equalsIgnoreCase("India"))
		//	{
		//		option.click();
		//	}}
		
	}

}

package flightBooking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class FlightWebsite {
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Flight Website Project"+'\n');
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//AUTO SUGGESTIVE DROPDOWN
		//the no of dropdown option is depended on the inputs like Ind for country search
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
		//find a generic locator to extract all the option,iterate and click
		List<WebElement> options = driver.findElements(By.cssSelector("li[class*='ui'] a"));
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
		    	option.click();
		    	break;
			}}
		
//DYNAMIC DROPDOWN - The dropdown is loaded only after the section is selected
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='COK']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
				
//PARENT TO CHILD RELATIONSHIP XPATH
//ALTERNATE TO INDEXING
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='COK']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='GOI']")).click();
	
//CALENDER DROPDOWN
		driver.findElement(By.cssSelector(".ui-datepicker-current-day")).click();
		
//VALIDATING IF ENABLED OR DISABLED
		System.out.println(driver.findElement(By.cssSelector("#Div1")).getDomAttribute("style")+"\n");
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("#Div1")).getDomAttribute("style"));
		if(driver.findElement(By.cssSelector("#Div1")).getDomAttribute("style").contains("1"))
		{
		System.out.println("\n"+"Is Enabled");
		Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
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
		
		

	
		
//HANDLING CHECKBOX
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Thread.sleep(2000);
//REGULAR EXPRESSION IN LOCATOR - CSS SELECTOR
		driver.findElement(By.cssSelector("input[name*='SeniorCitizenDiscount']")).click();
	//COUNT OF CHECK BOXES
		System.out.println("\n" + driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6 );		

		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}

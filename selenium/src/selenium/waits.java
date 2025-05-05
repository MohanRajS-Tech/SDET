package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//after selecting some option the website takes some time to load
		//4 ways for the syncornisation ,i.e, waits
		//IMPLICIT WAIT
		//defining wait time globally
		//like wait for 3sec before throwing any error,thts the max wait time
		//it will keep on listening to the DOM,once it finds it proceeds
		//disAdvntg -in some exceptional cases that takes longer thn expected like 15 sec
		//u cant increase the timer as we will not be able to detuct if othrs are taking more time
		//and it will increase the regTest time ,if thr is any issue
		
		//EXPLICIT WAIT
		//we can target a specific scenario and say to wait for 15 sec
		
		//thread.sleep - haults the execution for x sec
		//it is not part of selenium, its a java method
		//its waits for 5 sec even if the element loads in 1 sec
		//it does not listen to DOM
		
		
		
		
		

	}

}

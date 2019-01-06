package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
public WebDriver driver;
	
	By findAStudio=By.xpath("//*[@id='ela-menu-visitor-desktop-supplementa_find-a-studio']/span");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getfindAStudio()
	{
		return driver.findElement(findAStudio);
	}
	
}

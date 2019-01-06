package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StudioPage {
		
		public WebDriver driver;
		
			By zipcode =By.xpath("//*[@id='meetingSearch']");
			By locationName =By.xpath("//*[@id='ml-1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[1]/span");
			By locationDistance =By.xpath("//*[@id='ml-1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[2]");
			By locationAddress =By.xpath("//*[@id='ml-1180510']/result-location/div/div[1]/a/location-address/div/div/div[1]/div[2]");
			By locationCityZipcode =By.xpath("//*[@id='ml-1180510']//div[@class='location__city-state-zip'");
			By scheduleDetailed =By.xpath("//*[@id='content']/div/div/ui-view/ui-view/div[1]/div[2]/div/div/div[1]/div/div/schedule-detailed/div");
			By submitButton = By.xpath("//*[@id='content']/div/div/ui-view/ui-view/div/div[2]/form/div[1]/button");
		
			
			public StudioPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			this.driver=driver;
			
		}
	
		
		public WebElement getzipcode()
		{
			return driver.findElement(zipcode);
		}
		public WebElement getsubmitButton()
		{
			return driver.findElement(submitButton);
		}		

		public WebElement getlocationName()
		{
			return driver.findElement(locationName);
		}
		
		public WebElement getlocationDistance()
		{
			return driver.findElement(locationDistance);
		}
		
		public WebElement getlocationAddress()
		{
			return driver.findElement(locationAddress);
		}
		
		public WebElement getlocationCityZipcode()
		{
			return driver.findElement(locationCityZipcode);
		}
		public WebElement getscheduleDetailed()
		{
			return driver.findElement(scheduleDetailed);
		}
		
}

package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SchedulePage {
		
		public WebDriver driver;
			public static String scheduleMeetingDetails = "//*[@class='schedule-detailed']/div[1]/div[2]/div";
			public static String meetingSchedulerName = "//*[@class='schedule-detailed']/div[1]/div[2]/div/div[2]";
			By scheduleDetailedDetails =By.xpath("//*[@class='schedule-detailed']/div[1]/div[2]//*[@class='schedule-detailed-day-meetings-item-leader']");	
			public SchedulePage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			this.driver=driver;
			
		}
		public List<WebElement> weekSchedule(String weekday)
		{
			List<WebElement> weekSchedule = null;
			if(weekday.equals("SUN")){
				weekSchedule = driver.findElements(By.xpath(scheduleMeetingDetails.replace("div[1]", "div[1]")));
			}else if(weekday.equals("MON")){
				weekSchedule= driver.findElements(By.xpath(scheduleMeetingDetails.replace("div[1]", "div[2]")));
			}else if(weekday.equals("TUE")){
				weekSchedule = driver.findElements(By.xpath(scheduleMeetingDetails.replace("div[1]", "div[3]")));
			}else if(weekday.equals("WED")){
				weekSchedule = driver.findElements(By.xpath(scheduleMeetingDetails.replace("div[1]", "div[4]")));
			}else if(weekday.equals("THU")){
				weekSchedule = driver.findElements(By.xpath(scheduleMeetingDetails.replace("div[1]", "div[5]")));
			}else if(weekday.equals("FRI"))	{
				weekSchedule = driver.findElements(By.xpath(scheduleMeetingDetails.replace("div[1]", "div[6]")));
			}else if(weekday.equals("SAT")){
				weekSchedule = driver.findElements(By.xpath(scheduleMeetingDetails.replace("div[1]", "div[7]")));
			}
			return weekSchedule;
		}
		public List <WebElement> getName(String weekday)
		{
			List <WebElement> nameSchedule = null;
			if(weekday.equals("SUN")){
				nameSchedule = driver.findElements(By.xpath(meetingSchedulerName.replace("div[1]", "div[1]")));
			}else if(weekday.equals("MON")){
				nameSchedule= driver.findElements(By.xpath(meetingSchedulerName.replace("div[1]", "div[2]")));
			}else if(weekday.equals("TUE")){
				nameSchedule = driver.findElements(By.xpath(meetingSchedulerName.replace("div[1]", "div[3]")));
			}else if(weekday.equals("WED")){
				nameSchedule = driver.findElements(By.xpath(meetingSchedulerName.replace("div[1]", "div[4]")));
			}else if(weekday.equals("THU")){
				nameSchedule = driver.findElements(By.xpath(meetingSchedulerName.replace("div[1]", "div[5]")));
			}else if(weekday.equals("FRI"))	{
				nameSchedule = driver.findElements(By.xpath(meetingSchedulerName.replace("div[1]", "div[6]")));
			}else if(weekday.equals("SAT")){
				nameSchedule = driver.findElements(By.xpath(meetingSchedulerName.replace("div[1]", "div[7]")));
			}
			return nameSchedule;
		
		}
}

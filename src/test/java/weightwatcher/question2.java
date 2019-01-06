package weightwatcher;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import org.testng.Assert;
import pageObjects.LandingPage;
import pageObjects.SchedulePage;
import pageObjects.StudioPage;
import resources.browser;
public class question2 extends browser{
	public static Logger log =LogManager.getLogger(browser.class);
	/*
	 * Method for verifying Schedule Summary
	 */
	public static void verifyLadingPage() throws Exception
	{
		driver = initializeDriver();
		LandingPage l=new LandingPage(driver);
		Assert.assertEquals(driver.getTitle(), "WW (Weight Watchers): Weight Loss & Wellness Help");
		l.getfindAStudio().click();
		verifyFindStudioScreen();
	}
	
	public static void verifyFindStudioScreen() throws IOException
	{
		StudioPage sp=new StudioPage(driver);
		Assert.assertEquals(driver.getTitle(), "Find a Studio & Meeting Near You | WW USA");
		sp.getzipcode().sendKeys("10011");
		sp.getsubmitButton().click();
		System.out.println("Title of first location :"+ sp.getlocationName().getText()+ "  Distance :   "+sp.getlocationDistance().getText());
		log.info("Title of first location :"+ sp.getlocationName().getText()+ "  Distance :   "+sp.getlocationDistance().getText());
		sp.getlocationName().click();
		getScheduleSummary("THU");
	}
	
	
	public static void getScheduleSummary(String weekday) throws IOException
	{
		SchedulePage scp=new SchedulePage(driver);
		int meetingCount = scp.weekSchedule(weekday).size();
		ArrayList<String> meetingLeader = new ArrayList<String>();
		for(int i=0;i<meetingCount;i++){
			meetingLeader.add(scp.getName(weekday).get(i).getText().trim().toString());
			
		}
		HashMap<String, Integer> strinCountMap = new HashMap<String, Integer>();
		for (String meetingLeader1 : meetingLeader)
        {
            if(strinCountMap.containsKey(meetingLeader1))
            {
            	strinCountMap.put(meetingLeader1, strinCountMap.get(meetingLeader1)+1);
            }
            else
            {
            	strinCountMap.put(meetingLeader1, 1);
            }
        }
		for (String keys : strinCountMap.keySet())  
		{
			System.out.println("Name: "+keys + " Total: "+ strinCountMap.get(keys)+" times");
			log.info("Name: "+keys + " Total: "+ strinCountMap.get(keys)+" times");
		}
		
	}
	
}

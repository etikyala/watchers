package weightwatcher;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import resources.browser;

public class question3 {
	public static Logger log =LogManager.getLogger(browser.class);
	/*
	 * Method for finding smallest number in Random numbers 
	 */
	public static void randonNumber	() throws IOException
	{
		
		int leastNumber=100000;
		for (int i=1;i<=500;i++){
			int randNum = (int) (Math.random() *100000);
			System.out.println(i+" Random Number : "+randNum);
			log.info(i+" Random Number : "+randNum);
			if(randNum<leastNumber){
				leastNumber= randNum;
			}
		}
		System.out.println("Least Number out of 500 randam numbers is : "+leastNumber);
		log.info("Least Number out of 500 randam numbers is : "+leastNumber);
	}
}

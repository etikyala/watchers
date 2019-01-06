package weightwatcher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import resources.browser;

public class question1 {
	private static Scanner scanner; 
	public static Logger log =LogManager.getLogger(browser.class);
	/*
	 * Method for Print words and meanings 
	 */
	public static void printDictionary() throws IOException
	{
		
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\resources\\wordDictionary.txt";
		
		if(doesFileExist(path)){  
	        while (scanner.hasNextLine()) {
	        	String string = scanner.nextLine();
	            String[] word = string.split("-");	
	            System.out.println(word[0]);
	            log.info(word[0]);
	            String[] meaning = word[1].split(",");
	            for(int i=0;i<meaning.length;i++){
	            	System.out.println(meaning[i].toString().trim());
	               	log.info(meaning[i].toString().trim());
	            }
	        }
	    }
	}
	public static boolean doesFileExist(String path){
        File file = new File(path);
        try {
	        scanner = new Scanner(file);
	        log.info("File found and reading...");
	        return true;
        } catch (FileNotFoundException e) {
        log.info("File not found specified path: "+path);
        return false;
        }
	}
}

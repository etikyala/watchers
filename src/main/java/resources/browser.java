package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browser {

	public static WebDriver driver;
	public static Properties prop;
	public static WebDriver initializeDriver() throws IOException
	{
		getDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	private static void getDriver() throws IOException{
		 prop= new Properties();
		 FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		 prop.load(fis);
		 String browserName=prop.getProperty("browser");
		 if(browserName.equals("firefox")){
                System.setProperty("webdriver.gecko.driver","src\\main\\java\\resources\\geckodriver.exe");
                driver = new FirefoxDriver();
		 }else if(browserName.equals("ie")){
                System.setProperty("webdriver.ie.driver","src\\main\\java\\resources\\MicrosoftWebDriver.exe");
                driver= new InternetExplorerDriver();
		 }else if(browserName.equals("chrome"))
                System.setProperty("webdriver.chrome.driver","src\\main\\java\\resources\\chromedriver.exe");
                driver= new ChromeDriver();
       }

}

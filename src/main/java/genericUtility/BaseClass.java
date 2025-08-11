package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	WebDriver driver=null;
	PropertyFileUtility prop=new PropertyFileUtility();
	
	
	@BeforeSuite
	public void databaseConnect() {
		
		Reporter.log("Database conected successfully",true);
		
	}
	
	@BeforeClass
	public void setup() throws IOException {
		//driver=new ChromeDriver();
		String BROWSER = prop.toReadDataFromPropertyfile("browser");
	
			
			 Reporter.log("egde browser got lounched",true);
			 if (BROWSER.equalsIgnoreCase("chrome")) {
					driver = new ChromeDriver();

				} else if (BROWSER.equalsIgnoreCase("edge")) {
					driver = new EdgeDriver();
				}
		
	
		
	}
	
	@BeforeMethod
	public void login() throws IOException {
	
		String URL = prop.toReadDataFromPropertyfile("url");
		driver.get(URL);
	}
	
	public void teardown() {
		
		driver.close();
		
		
	}

}

package genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	
	
	public void ToMaxmise(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	public void tohandledropdownindex(int index,WebElement element) {
		Select select= new Select(element);
		select.selectByIndex(index);
		
	}
	 public void tohandbyvisibletext(WebElement element,String value) {
		 Select select= new Select(element);
		 select.selectByValue(value);
		 
	 }
	 public void tohandledropdownbyvisibletext(WebElement element,String text) {
		 Select select= new Select(element);
		 select.selectByValue(text);
		 
	 }
	 public void tominimize(WebDriver driver) {
		 driver.manage().window().minimize();
	 }
	 public void ToDragAndDrop(WebDriver driver,WebElement src,WebElement target) {
			Actions action=new Actions(driver);
			action.dragAndDrop(src, target).perform();
		}
	 public void ToDoubleClick(WebDriver driver,WebElement element) {
			Actions action=new Actions(driver);
			action.doubleClick(element).perform();
		}
		
		public void ToRightClick(WebDriver driver,WebElement element) {
			Actions action=new Actions(driver);
			action.contextClick(element).perform();
		}
		
		public void ToMoveToElement(WebDriver driver,WebElement element) {
			Actions action=new Actions(driver);
			action.moveToElement(element).perform();
			
		}
		public void WaitForElement(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}


}

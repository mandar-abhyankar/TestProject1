package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.PageHelper;

public class LetsTalkTeaPage {
	
	static WebDriver driver;
	private static By name = By.name("name");
	
	
	public LetsTalkTeaPage(WebDriver webdriver){
		
		driver = webdriver;
	}
	
	public void enterName(String username){
		
		PageHelper.waitForElementLoad(driver, name, 10);
		driver.findElement(name).sendKeys(username);
	}
	
	
}

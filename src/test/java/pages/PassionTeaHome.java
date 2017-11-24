package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import helper.PageHelper;

public class PassionTeaHome {
	
	private WebDriver driver;
	private static By CheckOutMenu = By.xpath("//a[contains(text(),'Check Out')]");
	private static By LetsTalkTea = By.xpath("//a[contains(text(),'Talk Tea')]");
	
	public PassionTeaHome(WebDriver webdriver){
		
		driver = webdriver;
		
	}
	
	public void clickCheckoutMenu(){
		
		PageHelper.waitForElementLoad(driver, CheckOutMenu, 10);
		driver.findElement(CheckOutMenu).click();
	}
	
	public void clickLetsTalkTeaMenu(){
		
		PageHelper.waitForElementLoad(driver, LetsTalkTea, 50);
		driver.findElement(LetsTalkTea).click();
	}

}

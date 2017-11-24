package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import helper.PageHelper;

public class CheckOutPage {

	static WebDriver driver;
	private static By emailfield = By.id("email");
	private static By name = By.id("name");
	private static By address = By.id("address");

	public CheckOutPage(WebDriver webdriver) {

		driver = webdriver;

	}

	public void enterEmail(String emailid) {

		PageHelper.waitForElementLoad(driver, emailfield, 10);
		driver.findElement(emailfield).sendKeys(emailid);
	}

	public void enterName(String usrname) {

		PageHelper.waitForElementLoad(driver, name, 10);
		driver.findElement(name).sendKeys(usrname);

	}

	public void enterAddress(String usraddress) {

		PageHelper.waitForElementLoad(driver, address, 10);
		driver.findElement(address).sendKeys(usraddress);
	}

}

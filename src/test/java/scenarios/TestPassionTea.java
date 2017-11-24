package scenarios;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jayway.jsonpath.JsonPath;

import pages.CheckOutPage;
import pages.LetsTalkTeaPage;
import pages.PassionTeaHome;

public class TestPassionTea {

	private WebDriver webdriver;
	static File testdatafile;
	private static String email = null;
	private static String name = null;
	private static String address = null;
	private static String fdbkname = null;
	
	@BeforeClass
	public static void testDataInit() throws IOException{
		
		testdatafile = new File("src/test/resources/testdata/TestPassionCheckout.json");
		email = JsonPath.read(testdatafile, "$."+"CheckOutPage[0].Email");
		name = JsonPath.read(testdatafile, "$."+"CheckOutPage[0].Name");
		address = JsonPath.read(testdatafile, "$."+"CheckOutPage[0].Address");
		fdbkname = JsonPath.read(testdatafile,"$."+"LetsTalkTea[0].Name");
		
	}
	

	@Before
	public void setUP() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\" + "Apps\\Dev Tools\\Selenium\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
		webdriver.get("http://www.practiceselenium.com/welcome.html");
		webdriver.manage().window().maximize();
	}
	
	@Test
	public void systemTest(){
		
		PassionTeaHome pth = new PassionTeaHome(webdriver) ;
		pth.clickCheckoutMenu();
		CheckOutPage cop = new CheckOutPage(webdriver);
		cop.enterEmail(email);
		cop.enterName(name);
		cop.enterAddress(address);
		//pth.clickCheckoutMenu();
		pth.clickLetsTalkTeaMenu();
		LetsTalkTeaPage lttp = new LetsTalkTeaPage(webdriver);
		lttp.enterName(fdbkname);
	}
	
	@After
	public void destroy(){
		
		webdriver.close();
		webdriver.quit();
		
	}

}

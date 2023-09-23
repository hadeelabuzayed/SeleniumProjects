


package seleniumProjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Almosafer {
	WebDriver driver = new ChromeDriver();
	SoftAssert Assertion=new SoftAssert();
	@BeforeTest
	public void myBeforeTest() {
		driver.get("https://global.almosafer.com/ar");
		driver.findElement(By.className("cta__saudi")).click();
		
	}
	@Test()
	public void myTest() {
		
		WebElement Currency=driver.findElement(By.className("dWRKFC"));
		String CurrencyText=Currency.getText();
		Assertion.assertEquals(CurrencyText,"SAR","passed");
		
		WebElement Language=driver.findElement(By.className("hcOfTd"));
		String LanguageText=Language.getText();
		Assertion.assertEquals(LanguageText,"English","pass");
		
		WebElement FlightButton=driver.findElement(By.id("uncontrolled-tab-example-tab-flights"));
		String FlightAttrbiute=FlightButton.getAttribute("class");
		Assertion.assertTrue(FlightAttrbiute.contains("active"), "The Flight Button is Active");
		Assertion.assertAll();
		
	}
	@AfterTest
	public void myAfterTest() {
		driver.quit();
	}

}
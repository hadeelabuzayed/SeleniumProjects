package magentoTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class signUP extends parameters {
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void BeforeSignTest() {
		driver.get(url);
		
		
	}
	
	
	@Test()	
	public void SignUpTest() {
		WebElement creatAccount= driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
		creatAccount.click();
		
		WebElement FirstName=driver.findElement(By.id("firstname"));
		FirstName.sendKeys(Lname);
		WebElement LastName=driver.findElement(By.id("lastname"));
		LastName.sendKeys(Fname);
		WebElement email=driver.findElement(By.id("email_address"));
		email.sendKeys(Email);
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(randomPassword);
		
		WebElement passwordconfirmation=driver.findElement(By.id("password-confirmation"));
		passwordconfirmation.sendKeys(randomPassword);
		email = Email;
        WebElement submit=driver.findElement(By.className("submit"));
		submit.click();
		
	}
	
	
	@AfterTest
	public void AfterSignUpTest() {
		 driver.quit();	
		
		
	}

}


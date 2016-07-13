package explicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:/Alok/chromedriver_win32(1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,1000);
		driver.get("http://store.demoqa.com/");
		WebElement we1=driver.findElement(By.xpath(".//*[@id='slides']/div[1]/div[3]/div/a/span"));
		we1.click();
		WebElement we2=driver.findElement(By.name("Buy"));
		we2.click();
		
		WebElement we3=w.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Go to Checkout")));
		we3.click();
	}
}

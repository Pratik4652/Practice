import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Setup {
	
	public WebDriver driver;
	
	@BeforeMethod
	
	public void LoginSetup(){
		
		System.setProperty("webdriver.chrome.driver", "webdrivers//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/upload");
		
	}
	
	@AfterMethod
	public void BrowserExit() throws InterruptedException{
		Thread.sleep(5000);;
		driver.quit();
	}

	@Test
	public void FileUpload(){
		
		 	String filename = "ww.png";
	        File file = new File(filename);
	        String path = file.getAbsolutePath();
	        driver.get("http://the-internet.herokuapp.com/upload");
	        driver.findElement(By.id("file-upload")).sendKeys(path);
	        driver.findElement(By.id("file-submit")).click();
	        
		
	}
}

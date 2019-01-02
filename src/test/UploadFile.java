package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import test.Setup;

import java.io.File;
public class UploadFile extends Setup {

	
	@Test
	public void FileUpload(){
		
		 	String filename = "some-file.txt";
	        File file = new File(filename);
	        String path = file.getAbsolutePath();
	        driver.get("http://the-internet.herokuapp.com/upload");
	        driver.findElement(By.id("file-upload")).sendKeys(path);
	        driver.findElement(By.id("file-submit")).click();
	        
		
	}
}

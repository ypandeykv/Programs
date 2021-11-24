package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://login.salesforce.com");
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("hello");
		driver.findElement(By.cssSelector("#password")).sendKeys("yo");
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		//driver.findElement(By.linkText("Forgot Your Password?")).click();
		//System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\'usernamegroup\']/label")).getText());
		
		//driver.close();
	

	}

}

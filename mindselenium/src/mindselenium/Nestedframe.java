package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframe {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://c:/mindtreec/frame.html");
		int count=driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().frame(driver.findElement(By.id("google")));
		driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]")).sendKeys("google");
		driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]")).sendKeys(Keys.ENTER);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("sele")));
		driver.findElement(By.xpath("/html/body/div/main/section[2]/div/div/div[1]/div/div[2]/div/a")).click();
		
		
		

	}

}

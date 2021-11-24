package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibibosuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://goibibo.com");
		WebElement ele=driver.findElement(By.xpath("//*[@id=\'gosuggest_inputSrc\']"));
		ele.clear();
		ele.sendKeys("hello");
		Thread.sleep(4000L);
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ENTER);
		WebElement wb=driver.findElement(By.xpath("//*[@id=\'gosuggest_inputDest\']"));
		wb.clear();
		wb.sendKeys("arg");
		Thread.sleep(400L);
		for(int i=0;i<5;i++)
		{
		wb.sendKeys(Keys.ARROW_DOWN);
		}
		wb.sendKeys(Keys.ENTER);
		
		


	}

}
 
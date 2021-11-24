package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ksrtc.in");
        driver.findElement(By.xpath("//*[@id=\"fromPlaceName\"]")).sendKeys("Ben");
        WebElement wb=driver.findElement(By.xpath("//*[@id=\"fromPlaceName\"]"));
        for(int i=0;i<2;i++)
        {
        	wb.sendKeys(Keys.ARROW_DOWN);
        	
        }
        wb.sendKeys(Keys.ENTER);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String script="return document.getElementById(\"fromPlaceName\").value;";
        String text=(String) js.executeScript(script);
        System.out.println(text);
        
        
	}

}

package mindselenium;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class AjaxMouseover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']"))).build().perform();
		//a.moveToElement(driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//a.moveToElement(driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"))).contextClick();
		
	

	}

}

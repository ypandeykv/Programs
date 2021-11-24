package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com");
		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input"));
		
		ele.clear();
		ele.sendKeys("ab");
		Thread.sleep(3000);
		for(int i=0;i<5;i++)
		{
		ele.sendKeys(Keys.ARROW_DOWN);
		}
		ele.sendKeys(Keys.ENTER);
		
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input"));
		ele1.clear();
		ele1.sendKeys("fds");
		Thread.sleep(3000);
	
		ele1.sendKeys(Keys.ARROW_DOWN);
		ele1.sendKeys(Keys.ENTER);
		

	}

}

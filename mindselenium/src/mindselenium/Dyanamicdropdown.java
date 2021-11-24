package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamicdropdown {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[11]/div[1]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]")).click();
	}

}

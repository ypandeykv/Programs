package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mianspicejet {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]")).click();
		Thread.sleep(2000L);
		int i=1;
		while(i<5)
		{
		driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
		i++;
		}
		
		driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[2]/div")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'main-container\']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div/div[2]/div[1]")).getText());
		

	}

}

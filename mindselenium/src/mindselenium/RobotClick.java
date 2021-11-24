package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fantasycricket.dream11.com/IN/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div/div[1]/div[1]/div/div/div[2]/div/a")).click();
		

	}

}

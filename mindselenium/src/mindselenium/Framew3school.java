package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framew3school {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")));
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		

	}

}

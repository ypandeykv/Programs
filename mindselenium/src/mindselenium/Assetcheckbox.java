package mindselenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assetcheckbox {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\automation\\yd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\'checkbox1\']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}

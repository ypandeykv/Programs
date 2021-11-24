package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Spicejet {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input")).sendKeys("yogesh pandey");
		driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[2]/input")).sendKeys("yo yo honey singh");
		driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[2]/div/textarea")).sendKeys("ganeshpur dehradun ");
		driver.findElement(By.xpath("//*[@id=\'eid\']/input")).sendKeys("ypandeykv@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'basicBootstrapForm\']/div[4]/div/input")).sendKeys("8533829651");
		WebElement wb=driver.findElement(By.xpath("//*[@id=\'Skills\']"));
		Select s=new Select(wb);
		Select s2=new Select(driver.findElement(By.xpath("//*[@id=\'country\']")));
		s.selectByIndex(6);
		s2.selectByIndex(10);
		
		
		
		
		


	}

}

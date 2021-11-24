package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		//driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		int count=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
		}
		
		

	}

}

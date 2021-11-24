package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		/*List<WebElement> radio=(List<WebElement>) driver.findElements(By.xpath("//input[@name='radiooptions' and @type='radio']"));
		for(int i=0;i<radio.size();i++)
		{
			WebElement local_radio=radio.get(i);
			String value=local_radio.getAttribute("value");
			System.out.println(value);
			if(value.equalsIgnoreCase("female"))
			{
				local_radio.click();
			}
		}*/
		int countkar=driver.findElements(By.xpath("//input[@name='radiooptions']")).size();
		System.out.println(countkar);
		for(int i=0;i<countkar;i++)
		{
		driver.findElements(By.xpath("//input[@name='radiooptions']")).get(1).click();
				
		}
	}

}

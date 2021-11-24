package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOpenDiffTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaclickacademy.com/practice.php");
		WebElement wb=driver.findElement(By.xpath("//*[@id=\'gf-BIG\']"));
		WebElement column=wb.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		int count=column.findElements(By.tagName("a")).size();
		for(int i=1;i<count;i++)
		{
			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
		}

	}

}

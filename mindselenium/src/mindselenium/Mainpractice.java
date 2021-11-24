package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.Select;

public class Mainpractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://goibibo.com");
		driver.findElement(By.xpath("//*[@id=\"roundTrip\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"gosuggest_inputSrc\"]")).click(); 
	WebElement wb=driver.findElement(By.xpath("//*[@id=\"gosuggest_inputSrc\"]"));
	wb.sendKeys("ab");
	Thread.sleep(2000);
	for(int i=0;i<6;i++)
	{
		wb.sendKeys(Keys.ARROW_DOWN);
	}
	wb.sendKeys(Keys.ENTER);
	WebElement ele=driver.findElement(By.xpath("//*[@id=\"gosuggest_inputDest\"]"));
	ele.sendKeys("a");
	Thread.sleep(2000);
	for(int i=0;i<4;i++)
	{
		ele.sendKeys(Keys.ARROW_DOWN);
		
	}
	ele.sendKeys(Keys.ENTER); 
	
	WebElement cal=driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[6]/div/div/div/div[2]/div/div[3]/div[2]/div[3]"));
	cal.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"searchWidgetCommon\"]/div[1]/div[1]/div[1]/div/div[8]/div/div/div/div[2]/div/div[3]/div[3]/div[5]")).click();
	driver.findElement(By.xpath("//*[@id=\"pax_link_common\"]")).click();
	for(int i=0;i<5;i++)
	{
	driver.findElement(By.xpath("//*[@id=\"adultPaxPlus\"]")).click();
	}
	for(int j=0;j<2;j++)
	{
	driver.findElement(By.xpath("//*[@id=\"childPaxPlus\"]")).click();
	}
	//<select class="custSelect width100 whiteBg padTB5 padLR10" id="gi_class" xpath="1"><option selected="" value="E">Economy</option><option value="B">Business</option><option value="F">First class</option><option value="W">Premium Economy</option></select>
	Select s= new Select(driver.findElement(By.xpath("//*[@id=\"gi_class\"]")));
	s.selectByIndex(1);
	driver.findElement(By.xpath("//*[@id=\"gi_search_btn\"]")).click();

	}

}

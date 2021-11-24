package mindselenium;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowChange {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"post-body-6170641642826198246\"]/a[1]")).click(); 
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		
		
		System.out.println(driver.getTitle());
		

	}

}

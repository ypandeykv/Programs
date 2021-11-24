package mindselenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\automation\\\\yd\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://healthcare.c2ta.co.in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		
		
		

	}

}

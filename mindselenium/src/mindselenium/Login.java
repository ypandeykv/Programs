package mindselenium;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


	public class Login {

		@Test
		public void hero()
		{
			System.setProperty("webdriver.chrome.driver","C:\\automation\\yd\\chromedriver.exe"); 
				WebDriver driver=new ChromeDriver();
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			}

		}






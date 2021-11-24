package mindselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHA PANDEY\\Desktop\\selinium2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//*[@id=\'draggable\']"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		a.dragAndDrop(source,target).build().perform();
		


	}

}

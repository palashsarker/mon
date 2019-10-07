package one;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\palsa\\eclipse-workspaceNew\\com.tt\\dd\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ee=driver.findElement(By.id("loginbutton"));
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("arguments[0].style.border='3px solid red'",ee );
		Thread.sleep(2000l);
		JavascriptExecutor jj = ((JavascriptExecutor)driver);
		//jj.executeScript("alert('login button is an issue')", ee);
		Thread.sleep(2000l);
		File ff=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ff, new File("C:\\Users\\palsa\\Desktop\\Driver\\nn.png"));
	}
	
}

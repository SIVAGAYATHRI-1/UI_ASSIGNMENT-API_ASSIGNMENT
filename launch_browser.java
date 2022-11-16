import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class launch_browser {
	@Test
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\Desktop\\CRM\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		

		  
		  
		
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Gayathri\\Desktop\\CRM\\geckodriver.exe");
		  WebDriver d1=new
		  FirefoxDriver(); 
		  d1.get("https://www.google.com");
		  
		  System.setProperty("webdriver.opera.driver","C:\\Users\\Gayathri\\Desktop\\CRM\\operadriver_win32\\operadriver.exe");
		  WebDriver d2=new OperaDriver();
		  d2.get("https://www.google.com");
		 
		 

	}
}
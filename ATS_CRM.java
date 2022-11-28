import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class ATS_CRM {

	public WebDriver wb;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\Desktop\\CRM\\chromedriver.exe" );
		wb=new ChromeDriver();

	}
	@Test(priority = 1)
	public void f() throws InterruptedException {
		pojo_class class1=new pojo_class();
		Faker f=new Faker();
		String mail1=f.internet().emailAddress();
		class1.setEmail(mail1);
		String password=f.internet().password();
		class1.setPassword(password);

		wb.get("https://devweb.recruitcrm.io/");
		String parent =wb.getWindowHandle();




		wb.findElement(By.linkText("Features")).click();
		wb.findElement(By.linkText("ATS")).click();
		wb.findElement(By.linkText("Sign in")).click();
		Thread.sleep(30000);

		Set<String> allparents=wb.getWindowHandles();

		for(String child:allparents) {
			if(!child.equals(parent)) {

				wb.switchTo().window(child);
				wb.findElement(By.id("sTestEmail")).sendKeys(class1.getEmail());
				wb.findElement(By.id("sTestPassword")).sendKeys(class1.getPassword());
				wb.findElement(By.id("sTestLoginBtn")).click();
				Thread.sleep(5000);
				wb.close();
				wb.switchTo().window(parent);


			}
		}
	}

	@Test(priority = 2)
	public void CRM() throws InterruptedException {
		pojo_class class1=new pojo_class();
		Faker f=new Faker();
		String mail1=f.internet().emailAddress();
		class1.setEmail(mail1);
		String password=f.internet().password();
		class1.setPassword(password);

		//wb.get("https://devweb.recruitcrm.io/");
		String parent1=wb.getWindowHandle();




		wb.findElement(By.linkText("Features")).click();
		wb.findElement(By.linkText("CRM")).click();
		wb.findElement(By.linkText("Sign in")).click();
		Thread.sleep(30000);

		Set<String> allparents=wb.getWindowHandles();
		for(String child:allparents) {
			if(!child.equals(parent1)) {
				wb.switchTo().window(child);
				wb.findElement(By.id("sTestEmail")).sendKeys(class1.getEmail());
				wb.findElement(By.id("sTestPassword")).sendKeys(class1.getPassword());
				wb.findElement(By.id("sTestLoginBtn")).click();
				Thread.sleep(5000);


			}
		}
	}

	public void end() {
		wb.quit();
	}


}



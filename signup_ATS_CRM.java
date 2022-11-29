import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//="sTest-companyTitleTxt
import com.github.javafaker.Faker;

public class Ats_CRM_signup {
	

	public WebDriver wb;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gayathri\\Desktop\\CRM\\chromedriver.exe" );
		wb=new ChromeDriver();

	}
	@Test(priority=1)
	public void f() throws InterruptedException {
		pojo_signup class2=new pojo_signup();
		Faker f=new Faker();
		String name=f.name().firstName();
		 class2.setName(name);
		String mail=f.internet().emailAddress();
		class2.setSignup_mail(mail);
		String password=f.internet().password();
		class2.setSignup_password(password);
		
		
		
		

		wb.get("https://devweb.recruitcrm.io/");
		String parent =wb.getWindowHandle();
		wb.findElement(By.linkText("Features")).click();
		wb.findElement(By.linkText("ATS")).click();
		wb.findElement(By.linkText("Try for Free")).click();

		Set<String> allparents=wb.getWindowHandles();

		for(String child:allparents) {
			if(!child.equals(parent)) {

				wb.switchTo().window(child);
				wb.findElement(By.id("userFirstName")).sendKeys( class2.getName());
				wb.findElement(By.id("userEmail")).sendKeys(class2.getSignup_mail());
				wb.findElement(By.id("userPassword")).sendKeys(class2.getSignup_password());
				wb.findElement(By.id("submitSignUp")).click();
				Thread.sleep(5000);
				wb.close();
				wb.switchTo().window(parent);


			}
		}



	}
	@Test(priority = 2)
	public void CRM() throws InterruptedException {
		pojo_signup class2=new pojo_signup();
		Faker f=new Faker();
		String name=f.name().firstName();
		 class2.setName(name);
		String mail=f.internet().emailAddress();
		class2.setSignup_mail(mail);
		String password=f.internet().password();
		class2.setSignup_password(password);
		

		wb.get("https://devweb.recruitcrm.io/");
		String parent =wb.getWindowHandle();
		wb.findElement(By.linkText("Features")).click();
		wb.findElement(By.linkText("CRM")).click();
		wb.findElement(By.linkText("Try for Free")).click();

		Set<String> allparents=wb.getWindowHandles();

		for(String child:allparents) {
			if(!child.equals(parent)) {

				wb.switchTo().window(child);
				Thread.sleep(3000);
				wb.findElement(By.id("sTest-companyTitleTxt")).sendKeys("Recruit CRM");
				wb.findElement(By.id("sTest-timezoneSrchTxt")).sendKeys("India");
				Actions keydown =new Actions(wb);
				Thread.sleep(3000);
				keydown.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
				
				wb.findElement(By.id("sTest-currencySrchTxt")).sendKeys("Rupees");
				Actions keydown1=new Actions(wb);
				keydown1.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
				
				wb.findElement(By.id("sTest-nextBtn")).click();
				/*
				 * wb.findElement(By.id("userFirstName")).sendKeys( class2.getName());
				 * wb.findElement(By.id("userEmail")).sendKeys(class2.getSignup_mail());
				 * wb.findElement(By.id("userPassword")).sendKeys(class2.getSignup_password());
				 * wb.findElement(By.id("submitSignUp")).click(); Thread.sleep(5000);
				 */
				wb.close();
				wb.switchTo().window(parent);


			}
		}



		
	}

	public void end() {
		wb.quit();
	}
	

}




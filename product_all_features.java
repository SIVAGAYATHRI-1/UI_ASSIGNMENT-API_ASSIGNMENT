package product;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ass {
	public WebDriver d;
	@BeforeTest
	public void start() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\Desktop\\CRM\\chromedriver.exe");
		d=new ChromeDriver();

	}







	@Test
	public void f() throws InterruptedException, AWTException {
		//launch browser




		d.get("https://dev.recruitcrm.io/candidates");
		Thread.sleep(10000);	

		//login
		d.findElement(By.id("sTestEmail")).sendKeys("sivagayathri@recruitcrm.io");
		d.findElement(By.id("sTestPassword")).sendKeys("Butterfly@001");
		d.findElement(By.id("sTestLoginBtn")).click(); 
		try { Thread.sleep(10000);
		}
		catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace(); 
		}


		//add candidates 
		d.findElement(By.cssSelector("#sTest-candidateIcon"));
		d.findElement(By.id("sTest-resumeParserBtn")).click();
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); //upload files
		d.findElement(By.xpath("/html/body/div[66]/div[2]/div/section/div[1]/div[2]/form/div/label/div/section/div/p[2]/span")).click();

		StringSelection s=new
				StringSelection("C:\\Users\\Gayathri\\Desktop\\company documents\\RESUME.pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Thread.sleep(7000); //paste
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL); 
		r.keyPress(KeyEvent.VK_V);

		Thread.sleep(7000); r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_ENTER); 
		r.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(20000); 
		//add company

		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //add company
		d.findElement(By.cssSelector("#sTest-companiesIcon")).click();
		Thread.sleep(3000);
		d.findElement(By.cssSelector("#sTest-addCompanyBtn")).click(); //enter data
		Thread.sleep(3000);
		d.findElement(By.id("sTest-companyNameTxt")).sendKeys("cognizant");

		d.findElement(By.id("sTest-companyCityTxt")).sendKeys("chennai");
		d.findElement(By.id("sTest-aboutCompany")).sendKeys("Cognizant (Nasdaq-100: CTSH) is one of the world's leading professional services companies, transforming clients' business, operating and technology models for the digital era. Our unique industry-based, consultative approach helps clients envision, build and run more innovative and efficient businesses. Headquartered in the U.S., Cognizant is ranked 195 on the Fortune 500 and is consistently listed among the most admired companies in the world. Learn how Cognizant helps clients lead with digital at www.cognizant.com or follow us @Cognizant on Twitter.");
		d.findElement(By.id("sTest-fbCompanyTxt")).sendKeys("https://www.facebook.com/Cognizant");
		d.findElement(By.id("sTest-twitterCompanyTxt")).sendKeys("https://twitter.com/Cognizant");
		d.findElement(By.id("sTest-linkedinCompanyTxt")).sendKeys("https://www.linkedin.com/company/cognizant");
		d.findElement(By.xpath("//*[@id=\"sTest-companySubmitBtn\"]")).click();



		Thread.sleep(4000);

		//d.get("https://dev.recruitcrm.io/dashboard");

		//add contacts /*
		d.findElement(By.cssSelector("#sTest-contactsIcon")).click();
		d.findElement(By.id("sTest-addContactBtn")).click();

		d.findElement(By.id("sTest-contactFirstnameTxt")).sendKeys("Rahul");

		//d.findElement(By.className("vs__search")).sendKeys("tcs").;


		d.findElement(By.xpath("//*[@id=\"sTest-contactDesignationTxt\"]")).sendKeys("HR") ;
		d.findElement(By.xpath("//*[@id=\"sTest-contactEmailTxt\"] ")).sendKeys("ghy@gmail.com") ;
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"sTest-contactContactnumberTxt\"]")).sendKeys("56789432");
		d.findElement(By.xpath("//*[@id=\"sTest-contactCityTxt\"]")).sendKeys("maharastra") ;

		Thread.sleep(40000); 
		d.findElement(By.xpath("//*[@id=\"sTest-contactAddBtn\"] ")).click();





		Thread.sleep(10000);


		//add jobs
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.findElement(By.id("sTest-jobsIcon")).click()	;
		d.findElement(By.xpath("//*[@id=\"sTest-addJobListBtn\"]")).click()	;

		d.findElement(By.name("jobtitle")).sendKeys("software trainee");
		d.findElement(By.xpath("//*[@id=\"sTest-companysearchControl\"] ")).sendKeys("tcs")	;
		d.findElement(By.xpath("//*[@id=\"sTest-optionTitle\"]")).click();



		d.findElement(By.cssSelector("#sTest-jobAnnualsalaryMin")).sendKeys("70000")	;
		d.findElement(By.cssSelector(" #sTest-jobAnnualsalaryMax")).sendKeys("350000")	;
		d.findElement(By.id("sTest-jobCityTxt")).sendKeys("chennai");
		d.findElement(By.xpath("//*[@id=\"sTest-jobStateTxt\"]")).sendKeys("Tamilnadu");
		d.findElement(By.id("sTest-jobAddress")).sendKeys("	It stands located at Chennai 1 ETC Tower, 200 Feet Road, MCN Nagar Extension, Pallavaram Ring Road, Thoraipakkam-600097.");
		d.findElement(By.id("sTest-companyAddBtn")).click();

		d.get("https://dev.recruitcrm.io/dashboard");


		//sign-out
		d.findElement(By.id("sTest-dpLinkInAppBtn")).click();
		d.findElement(By.id("sTest-signOutInAppBtn")).click();


	}

	@AfterTest
	public void end() {
		d.close();
	}




	// TODO Auto-generated method stub

}

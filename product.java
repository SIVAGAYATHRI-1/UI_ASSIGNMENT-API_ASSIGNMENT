import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prd {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\Desktop\\CRM\\chromedriver.exe");
		WebDriver d=new ChromeDriver();

		d.get("https://dev.recruitcrm.io/candidates");

		//login
		d.findElement(By.id("sTestEmail")).sendKeys("sivagayathri@recruitcrm.io");
		d.findElement(By.id("sTestPassword")).sendKeys("Butterfly@001");
		d.findElement(By.id("sTestLoginBtn")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




		Thread.sleep(5000);
		//add candidates 
		d.findElement(By.cssSelector("#sTest-candidateIcon"));
		d.findElement(By.id("sTest-resumeParserBtn")).click();
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
		//upload files
		d.findElement(By.xpath("/html/body/div[66]/div[2]/div/section/div[1]/div[2]/form/div/label/div/section/div/p[2]/span")).click();

		StringSelection s=new StringSelection("C:\\Users\\Gayathri\\Desktop\\company documents\\RESUME.pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Thread.sleep(7000);
		//paste 
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL); 
		r.keyPress(KeyEvent.VK_V);

		Thread.sleep(7000); 
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_ENTER); r.keyRelease(KeyEvent.VK_ENTER);
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
		d.get("https://dev.recruitcrm.io/dashboard");
		
		
		// add company
		d.findElement(By.cssSelector("#sTest-companiesIcon")).click();
		Thread.sleep(3000);
		d.findElement(By.cssSelector("#sTest-addCompanyBtn")).click(); //enter data
		Thread.sleep(3000);
		d.findElement(By.id("sTest-companyNameTxt")).sendKeys("cognizant");

		d.findElement(By.id("sTest-companyCityTxt")).sendKeys("chennai");
		d.findElement(By.id("sTest-aboutCompany")).
		sendKeys("Cognizant (Nasdaq-100: CTSH) is one of the world's leading professional services companies, transforming clients' business, operating and technology models for the digital era. Our unique industry-based, consultative approach helps clients envision, build and run more innovative and efficient businesses. Headquartered in the U.S., Cognizant is ranked 195 on the Fortune 500 and is consistently listed among the most admired companies in the world. Learn how Cognizant helps clients lead with digital at www.cognizant.com or follow us @Cognizant on Twitter."); 
		d.findElement(By.id("sTest-fbCompanyTxt")).sendKeys("https://www.facebook.com/Cognizant");
		d.findElement(By.id("sTest-twitterCompanyTxt")).sendKeys("https://twitter.com/Cognizant");
		d.findElement(By.id("sTest-linkedinCompanyTxt")).sendKeys("https://www.linkedin.com/company/cognizant");

		//submit d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id=\"sTest-companySubmitBtn\"]")).click();

		//signout
		d.findElement(By.xpath("//*[@id=\"navbarExampleTransparentExample\"]/div[4]/div[5]/div[3]/div/div/a[1]/div/figure/p/img"));
		d.findElement(By.cssSelector("#sTest-signOutInAppBtn"));

		d.quit();



























		/*//add job
		
		  d.findElement(By.xpath("//*[@id=\"sTest-jobsIcon\"]")).click();
		  Thread.sleep(3000);
		  
		  d.findElement(By.cssSelector("#sTest-addJobListBtn")).click();
		  Thread.sleep(3000);
		  
		  d.findElement(By.name("jobtitle")).sendKeys("softwaretrainee");
		  d.findElement(By.xpath("//*[@id=\"sTest-addNewCompanyIcon\"]/i")).click();
		  Thread.sleep(3000);
		 
		
		  //add new company
		  d.findElement(By.id("sTest-companyNameTxt")).sendKeys("cognizant");
		  
		  d.findElement(By.id("sTest-companyCityTxt")).sendKeys("chennai");
		  d.findElement(By.id("sTest-aboutCompany")).
		  sendKeys("Cognizant (Nasdaq-100: CTSH) is one of the world's leading professional services companies, transforming clients' business, operating and technology models for the digital era. Our unique industry-based, consultative approach helps clients envision, build and run more innovative and efficient businesses. Headquartered in the U.S., Cognizant is ranked 195 on the Fortune 500 and is consistently listed among the most admired companies in the world. Learn how Cognizant helps clients lead with digital at www.cognizant.com or follow us @Cognizant on Twitter."
		  ); d.findElement(By.id("sTest-fbCompanyTxt")).sendKeys(
		  "https://www.facebook.com/Cognizant");
		  d.findElement(By.id("sTest-twitterCompanyTxt")).sendKeys(
		  "https://twitter.com/Cognizant");
		  d.findElement(By.id("sTest-linkedinCompanyTxt")).sendKeys(
		  "https://www.linkedin.com/company/cognizant");
		  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  d.findElement(By.xpath("//*[@id=\"sTest-companySubmitBtn\"]")).click();
		  
		  
		  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // select company
		  d.findElement(By.cssSelector("#sTest-companysearchControl")).sendKeys("tcs");
		  
		  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  d.findElement(By.xpath("//*[@id=\"sTest-optionTitle\"]/p")).click();
		  
		  //min exp WebElement
		  wb=d.findElement(By.id("sTest-jobminExperienceinYears")); Select s=new
		  Select(wb); s.selectByIndex(1); //max exp WebElement
		  wb1=d.findElement(By.id("sTest-jobminExperienceinYears")); Select s1=new
		  Select(wb1); s1.selectByVisibleText("3");
		  
		  //save job
		  d.findElement(By.xpath("//*[@id=\"sTest-companyAddBtn\"]")).click();*/
		 

	}

}

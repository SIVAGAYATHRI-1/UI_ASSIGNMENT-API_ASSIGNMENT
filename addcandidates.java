package product;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.DurationFormatUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.util.Duration;

public class add_candidates {
	WebDriver d;

	public add_candidates(WebDriver d2) {
		// TODO Auto-generated constructor stub
		this.d = d2;
	}

	// candidates

	By icon = By.cssSelector("#sTest-candidateIcon");
	By addcandidateicon = By.id("sTest-resumeParserBtn");
	By uploadfiles = By.id("sTest-uploadFilesForResumeParser");
	By addc = By.id("sTest-addCandidateBtn");
	By fname = By.name("firstname");
	By mail = By.name("email");
	By city = By.cssSelector("#sTest-candidateCity");
	By address = By.cssSelector("#sTest-candidateAddress");
	By speci=By.id("sTest-candidateSpecialization");
	By qua = By.id("sTest-candidateQualification");
	By org = By.id("sTest-candidateOrganisation");
	By pos = By.id("sTest-candidatePosition");
	By fb = By.id("sTest-candidateFbTxt");
	By twit = By.id("sTest-candidateTwitterTxt");
	By link = By.id("sTest-candidateLinkedinTxt");
	By skill = By.xpath("//*[@id=\"sTest-candidateSkills\"]/div/div/div[1]/input");
	By lang = By.id("sTest-candidateLanguage");
	By prof = By.id("sTest-candidateProficiencyLevel");
	By add = By.id("sTest-candidateLangRowAddBtn");
	By sal = By.id("sTest-candidateAnnualSalary");
	By expsal = By.id("sTest-candidateExpectatedSalary");
	By subadd = By.id("sTest-candidateAddBtn");
	By git=By.xpath("//*[@id=\"sTest-githubTxt\"]");
	By xing=By.xpath("//*[@id=\"sTest-candidateXingTxt\"]");
	By source=By.xpath("//*[@id=\"sTest-candidateSourceTxt\"]");

	By ph = By.xpath("//*[@id=\"sTest-candidateMobile\"] ");
	By loc = By.xpath("//*[@id=\"sTest-candidateLocality\"]");

	// adding custom field   //*[@id="sTest-adminSettingIcon"]
	By settings = By.xpath("//*[@id=\"sTest-adminSettingIcon\"]");
	By customfield = By.id("sTest-customCandidateIconAdminSettings");
	By addfield = By.xpath("//*[@id=\"sTest-addFieldBtn\"]");
	By name0 = By.name("custumField0");
	By name1 = By.name("custumField1");
	By name2 = By.name("custumField2");
	By name3 = By.name("custumField3");
	By name4 = By.name("custumField4");
	By name5 = By.name("custumField5");
	By name6 = By.name("custumField6");
	By name7 = By.name("custumField7");
	By name8 = By.name("custumField8");
	By name9 = By.name("custumField9");
	By drop = By.id("sTest-enabled");
	By dropdown = By.name("dropddown_value5");
	By dropdown1 = By.name("dropddown_value6");
	By save = By.xpath("//*[@id=\"sTest-saveCustomBtn\"]");

	// actions
	public void validate_addcandidates() throws AWTException, InterruptedException {

		WebDriverWait w1 = new WebDriverWait(d, 20);


		
		  w1.until(ExpectedConditions.elementToBeClickable(icon));
		  
		  d.findElement(icon).click(); d.findElement(addcandidateicon).click();
		  
		  d.findElement(uploadfiles).
		  sendKeys("C:\\Users\\Gayathri\\Desktop\\company documents\\IBM resume.pdf");
		 


		// add candidates by manual


		/*
		 * w1.until(ExpectedConditions.elementToBeClickable(icon));
		 * d.findElement(icon).click();
		 * w1.until(ExpectedConditions.elementToBeClickable(addc));
		 * 
		 * d.findElement(addc).click(); d.findElement(fname).sendKeys("Ravi");
		 * d.findElement(mail).sendKeys("abcde@gmail.com");
		 * d.findElement(ph).sendKeys("1234567889");
		 * d.findElement(city).sendKeys("chennai");
		 * d.findElement(loc).sendKeys("xfghu");
		 * d.findElement(address).sendKeys("xyznhit   hjki lopiuy");
		 * d.findElement(qua).click(); d.findElement(qua).sendKeys("Bachelor's Degree");
		 * d.findElement(qua).click();
		 * d.findElement(speci).sendKeys("Information Technology"); //educationaldetails
		 * d.findElement(org).sendKeys("jsw");
		 * d.findElement(pos).sendKeys("java developer");
		 * d.findElement(sal).sendKeys("700000");
		 * d.findElement(expsal).sendKeys("1000000");
		 * d.findElement(skill).sendKeys("Python"); //social network
		 * d.findElement(fb).sendKeys("xyzfb"); d.findElement(twit).sendKeys("xyztwit");
		 * d.findElement(link).sendKeys("xyzlink");
		 * d.findElement(git).sendKeys("xyzlink");
		 * d.findElement(xing).sendKeys("xyzlink");
		 * d.findElement(source).sendKeys("xyzlink"); //submit
		 * d.findElement(subadd).click();
		 */


		WebDriverWait w2=new WebDriverWait(d,40);

		//w2.until(ExpectedConditions.visibilityOfElementLocated(settings));
		//w2.until(ExpectedConditions.elementToBeClickable(settings));
		Thread.sleep(20000);
		
		// admin setting
		d.findElement(settings).click();
		d.findElement(customfield).click();
		d.findElement(addfield).click();
		// text
		d.findElement(name0).sendKeys("aadharcard_name");
		WebElement wb3 = d.findElement(drop);
		Select s3 = new Select(wb3);
		s3.selectByIndex(0);
		d.findElement(save).click();
		d.findElement(addfield).click();

		// long-text
		d.findElement(name1).sendKeys("address-2");
		WebElement wb4 = d.findElement(drop);
		Select s4 = new Select(wb4);
		s4.selectByIndex(1);
		d.findElement(save).click();
		d.findElement(addfield).click();

		// date
		d.findElement(name2).sendKeys("Date Of Birth");
		WebElement wb5 = d.findElement(drop);
		Select s5 = new Select(wb5);
		s5.selectByIndex(2);
		d.findElement(save).click();
		d.findElement(addfield).click();

		// add pincode-number
		d.findElement(name3).sendKeys("pincode");
		WebElement wb2 = d.findElement(drop);
		Select s2 = new Select(wb2);
		s2.selectByIndex(3);
		d.findElement(save).click();
		d.findElement(addfield).click();

		// maraital status-checkbox
		d.findElement(name4).sendKeys("maraital status");
		WebElement wb6 = d.findElement(drop);
		Select s6 = new Select(wb6);
		s6.selectByIndex(4);
		d.findElement(save).click();
		d.findElement(addfield).click();

		// add other interest-dropdown
		d.findElement(name5).sendKeys("other-interest");
		WebElement wb7 = d.findElement(drop);
		Select s7 = new Select(wb7);
		s7.selectByIndex(5);
		d.findElement(dropdown).sendKeys("Web development,Artificial Inteligence");
		d.findElement(save).click();
		d.findElement(addfield).click();

		// add other certificate-multiselect
		d.findElement(name6).sendKeys("other-certificates");
		WebElement wb8 = d.findElement(drop);
		Select s8 = new Select(wb8);
		s8.selectByIndex(6);
		d.findElement(dropdown1).sendKeys("pcpa-python,udemy-java");
		d.findElement(save).click();
		d.findElement(addfield).click();

		// phone num
		d.findElement(name7).sendKeys("phone number-2");
		WebElement wb9 = d.findElement(drop);
		Select s9 = new Select(wb9);
		s9.selectByIndex(7);
		d.findElement(save).click();
		d.findElement(addfield).click();

		// email
		d.findElement(name8).sendKeys("email-2");
		WebElement wb10 = d.findElement(drop);
		Select s10 = new Select(wb10);
		s10.selectByIndex(8);
		d.findElement(save).click();
		d.findElement(addfield).click();

		// file
		d.findElement(name9).sendKeys("upload UG-marksheet");
		WebElement wb11 = d.findElement(drop);
		Select s11 = new Select(wb11);
		s11.selectByIndex(9);
		d.findElement(save).click();

	}

	private void customfield() {
		// TODO Auto-generated method stub

	}

}

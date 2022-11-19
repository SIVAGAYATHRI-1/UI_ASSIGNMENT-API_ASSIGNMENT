package product;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addjob {
	WebDriver d;
	

	public addjob(WebDriver d) {
		super();
		this.d = d;
		PageFactory.initElements(d, this);
	}
	//locators
	
	@FindBy(xpath="//*[@id=\"sTest-jobsIcon\"]") public WebElement jobicon;
	@FindBy(xpath="//*[@id=\"sTest-addJobListBtn\"]") public WebElement addjob;
	@FindBy(name="jobtitle")public WebElement jobtittle;
	@FindBy(xpath="//*[@id=\"sTest-companysearchControl\"] ")public WebElement companysearch ;
	@FindBy(xpath="//*[@id=\"sTest-optionTitle\"]")public WebElement option;
	
	@FindBy(id="sTest-jobAnnualsalaryMin")public WebElement min;
	@FindBy(id="sTest-jobAnnualsalaryMax")public WebElement max;
	@FindBy(id="sTest-jobCityTxt")public WebElement jobcity;
	@FindBy(xpath="//*[@id=\"sTest-jobStateTxt\"]")public WebElement state;
	@FindBy(id="sTest-jobAddress")public WebElement add;
	@FindBy(id="sTest-companyAddBtn")public WebElement compbtn;

	public void validate_addjob() throws InterruptedException{
		//WebDriverWait w=new WebDriverWait(d, 50);
		//w.until(ExpectedConditions.elementToBeClickable(jobicon));
		Thread.sleep(20000);
		

		jobicon.click()	;
		//w.until(ExpectedConditions.elementToBeClickable(addjob));
		Thread.sleep(30000);
		addjob.click()	;

		jobtittle.sendKeys("software trainee");
		companysearch.sendKeys("tcs")	;
		option.click();



		min.sendKeys("70000")	;
		max.sendKeys("350000")	;
		jobcity.sendKeys("chennai");
		state.sendKeys("Tamilnadu");
		add.sendKeys("	It stands located at Chennai 1 ETC Tower, 200 Feet Road, MCN Nagar Extension, Pallavaram Ring Road, Thoraipakkam-600097.");
		compbtn.click();

		

	}

}

}

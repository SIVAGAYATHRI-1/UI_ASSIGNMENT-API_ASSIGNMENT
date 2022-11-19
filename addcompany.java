package product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class add_company {
	WebDriver d;

	public add_company(WebDriver d) {
		super();
		this.d = d;
	}
	
	//locators
	By comp_icon=By.cssSelector("#sTest-companiesIcon");
	By addcompany=By.cssSelector("#sTest-addCompanyBtn");
	By addcompanyname=By.id("sTest-companyNameTxt");
	By addcity=By.id("sTest-companyCityTxt");

	By aboutcompany=By.id("sTest-aboutCompany");
	By fbcompany=By.id("sTest-fbCompanyTxt");
	By twitcompany=By.id("sTest-twitterCompanyTxt");
	By linkcompany=By.id("sTest-linkedinCompanyTxt");
	By subbtn=By.xpath("//*[@id=\"sTest-companySubmitBtn\"]");
	
	//action
	public void validate_addcompany() throws InterruptedException {
	WebDriverWait w=new WebDriverWait(d, 20);
	w.until(ExpectedConditions.elementToBeClickable(comp_icon));
	d.findElement(comp_icon).click();
	
	d.findElement(addcompany).click(); 
	
	d.findElement(addcompanyname).sendKeys("cognizant");

	d.findElement(addcity).sendKeys("chennai");
	d.findElement(aboutcompany).sendKeys("Cognizant (Nasdaq-100: CTSH) is one of the world's leading professional services companies, transforming clients' business, operating and technology models for the digital era. Our unique industry-based, consultative approach helps clients envision, build and run more innovative and efficient businesses. Headquartered in the U.S., Cognizant is ranked 195 on the Fortune 500 and is consistently listed among the most admired companies in the world. Learn how Cognizant helps clients lead with digital at www.cognizant.com or follow us @Cognizant on Twitter.");
	d.findElement(fbcompany).sendKeys("https://www.facebook.com/Cognizant");
	d.findElement(twitcompany).sendKeys("https://twitter.com/Cognizant");
	d.findElement(linkcompany).sendKeys("https://www.linkedin.com/company/cognizant");
	w.until(ExpectedConditions.elementToBeClickable(subbtn));
	d.findElement(subbtn).click();



	Thread.sleep(4000);
	}

}


package product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class add_contact {
	WebDriver d;

	public add_contact(WebDriver d) {
		super();
		this.d = d;
	}
	
	//locators
	By contacticon=By.cssSelector("#sTest-contactsIcon");
	By addcontactbtn=By.id("sTest-addContactBtn");
	By firstname=By.id("sTest-contactFirstnameTxt");
	By design=By.xpath("//*[@id=\"sTest-contactDesignationTxt\"]");
	By mail=By.xpath("//*[@id=\"sTest-contactEmailTxt\"] ");
	By num=By.xpath("//*[@id=\"sTest-contactContactnumberTxt\"]");
	By city=By.xpath("//*[@id=\"sTest-contactCityTxt\"]");
	By subcontact=By.xpath("//*[@id=\"sTest-contactAddBtn\"] ");
	
	//actions
	public void validate_addcompany() throws InterruptedException {
		
	WebDriverWait w=new WebDriverWait(d, 60);
	w.until(ExpectedConditions.elementToBeClickable(contacticon));
	Thread.sleep(20000);
	d.findElement(contacticon).click();
	d.findElement(addcontactbtn).click();

	d.findElement(firstname).sendKeys("Rahul");

	//d.findElement(By.className("vs__search")).sendKeys("tcs");


	d.findElement( design).sendKeys("HR") ;
	d.findElement(mail).sendKeys("ghy@gmail.com") ;
	
	d.findElement(num).sendKeys("56789432");
	d.findElement(city).sendKeys("maharastra") ;

	w.until(ExpectedConditions.elementToBeClickable(subcontact));
	d.findElement(subcontact).click();
	}

}

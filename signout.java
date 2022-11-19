
package product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signout {
	WebDriver d;

	public signout(WebDriver d) {
		super();
		this.d = d;
		PageFactory.initElements(d, this);
	}
	@FindBy(id="sTest-dpLinkInAppBtn") public WebElement dp;
	@FindBy(id="sTest-signOutInAppBtn")public WebElement out;
	
	public void validate_signout() throws InterruptedException {
	//WebDriverWait w=new WebDriverWait(d, 50);
	//w.until(ExpectedConditions.elementToBeClickable(dp));
	Thread.sleep(20000);
	
	
	dp.click();
	out.click();
	d.quit();
	}

}

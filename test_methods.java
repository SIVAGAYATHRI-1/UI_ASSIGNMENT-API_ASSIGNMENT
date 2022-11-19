package product.tests;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import product.add_candidates;
import product.add_company;
import product.add_contact;
import product.addjob;
import product.login;
import product.signout;
@Test
public class test_login {

	public static void main(String args[]) throws AWTException, InterruptedException {
		WebDriver d;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gayathri\\Desktop\\CRM\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://dev.recruitcrm.io");

		login l=new login(d);
		l.validate();

		
		
		
		add_candidates a=new add_candidates(d); a.validate_addcandidates();
		  
		  
		  
		  add_company a1=new add_company(d); a1.validate_addcompany();
		  
		  add_contact a2=new add_contact(d); a2.validate_addcompany();
		  
		  addjob a3=new addjob(d); a3.validate_addjob();
		 

		signout s=new signout(d);
		s.validate_signout();
	}








}


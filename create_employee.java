package com.practice.Framework.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.practice.Framework.Base.BaseTest;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class get_all_employees extends BaseTest{
	@Test
	public void getemployee() {
		RestAssured.baseURI="https://gorest.co.in";
		requestSpecification=RestAssured.given();
		response=requestSpecification.request(Method.GET,"/public/v2/users/"+id);
		System.out.println(response.getBody().asString());
		
		}
	@Test(priority=1)
	public void verifystatuscode() {
		int statuscode=response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
	}
	@Test(priority=2)
	 void verifystatusline() {
		
		String statusline=response.getStatusLine();
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
		
	}
	
	

}

package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {
	
	@Test
	public void getResponseCode()
	{
		Response response = RestAssured.get("https://www.google.com");
		Assert.assertEquals(response.statusCode(), 200);
		System.out.println("Status code is : " + response.statusCode());
		System.out.println("Response Time is : " + response.getTime());
	}
	
	@Test
	public void getBody() 
	{
		Response response = RestAssured.get("http://parabank.parasoft.com/parabank/services/bank/customers/12212/");
		System.out.println(response.asString());
	}
}

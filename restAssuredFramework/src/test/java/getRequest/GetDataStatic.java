package getRequest;

import org.codehaus.groovy.transform.EqualsAndHashCodeASTTransformation;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetDataStatic {
	
	@Test
	public void getResponseCode()
	{

		String URL = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
		//get(URL).then().body("weather", equals(3));
		;
	}
}

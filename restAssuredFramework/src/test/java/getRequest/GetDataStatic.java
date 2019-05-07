package getRequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class GetDataStatic {
	
	@Test
	public void getResponseCode()
	{
		String URL = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";

		given().
		when().
			get(URL).
		then().
			assertThat().                                                                                                                                                                         			
			statusCode(200).
			and().
			header("connection", "keep-alive");
	}
}

/*package org.Restservices;

import java.io.IOException;

import org.Mytesting.BusinessLogic;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class RestwebservicesrunnerTest {
	BusinessLogicwebservices buslogicwebservice= new BusinessLogicwebservices();
	
	@Test
	public void RegistrationSuccessful() throws JSONException, InterruptedException, IOException
	{	
		
		BeanLogicwebservices.postrequestimplement();
		String body=buslogicwebservice.payload();
		buslogicwebservice.postrequest("http://restapi.demoqa.com/customer",body);
		System.out.println("Test complete");
	}
	

}
*/
package org.Restservices;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class BusinessLogicwebservices {
	
	public void postrequest(String uri,String body) throws InterruptedException, JSONException {		
		RestAssured.baseURI =uri;
		RequestSpecification request = RestAssured.given(); 		
		request.body(body);
		Response response = request.post("/register");
		System.out.println("response value :"+response);
		int statusCode = response.getStatusCode();
		System.out.println("statusCode value :"+statusCode);
		//Assert.assertEquals(statusCode, "200");
		Assert.assertEquals(statusCode, 200);
	}
	public String payload() throws JSONException
	{
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Virender"); // Cast
		requestParams.put("LastName", "Singh");
		requestParams.put("UserName", "sdimpleuser2dd2011");
		requestParams.put("Password", "password1");
		
	 
		requestParams.put("Email",  "sample2ee26d@gmail.com");
		return requestParams.toString();
		
	}

}

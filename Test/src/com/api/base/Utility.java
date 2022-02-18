package com.api.base;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utility {

	@Test
	public void testGETWeather() {
		// TODO Auto-generated method stub
	
		RestAssured.baseURI="https://randomuser.me/api/";
		RequestSpecification httprequest=RestAssured.given();
		Response response=httprequest.request(Method.GET);
		String body=response.getBody().asString();
		System.out.println(body);
		System.out.println(response.getStatusCode());
	}

}

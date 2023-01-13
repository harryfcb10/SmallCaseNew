package Utilities;

import io.restassured.RestAssured;


public class Setup 
{
	String BaseURI="https://bookstore.toolsqa.com";
	public void SetupAPI()
	
	{		
      RestAssured.baseURI="";
	}
}

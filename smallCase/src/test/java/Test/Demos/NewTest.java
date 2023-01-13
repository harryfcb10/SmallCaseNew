package Test.Demos;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Utilities.Setup;
import io.restassured.module.jsv.JsonSchemaValidator;
public class NewTest {
	Setup setup=new Setup();
	
   @Test
   public void responseAssertion() {
	   setup.SetupAPI();
      //base URL

      //GET operation
      given().when().get("/BookStore/v1/Books").
      then().log().all()

     

      //verify body
      .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("sample.json"));;

   }
}
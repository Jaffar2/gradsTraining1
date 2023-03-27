package trainingApi;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

public class GetRequests {
	
	@Test
	public void getListUsers() {
		
		RestAssured.baseURI = "https://reqres.in/api";
		RestAssured.given().param("page", "2")
		  .when()
		  .get("/users")
		  .then()
		  .assertThat()
		  .log()
		  .all()
		  .statusCode(200);
		  
		               
	}
	
	@Test
	public void getListUser() {
		
		RestAssured.baseURI = "https://reqres.in/api";
		RestAssured.given()
		  .when()
		  .get("/users/2")
		  .then()
		  .assertThat()
		  .log()
		  .all()
		  .statusCode(200);
		  
		               
	}
	


}

package trainingApi;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PostRequest {
		
		@Test
		public void createUser() {
			
			RestAssured.baseURI = "https://reqres.in/api";
			RestAssured.given()
			  .header("Content-Type", "application/json")
			  .contentType(ContentType.JSON)
			  .when()
			  .body(new File ("./Payload1.json"))
			  .post("/users")
			  .then()
			  .assertThat()
			  .log()
			  .all()
			  .statusCode(201);
			  
			               
		}
		
	}



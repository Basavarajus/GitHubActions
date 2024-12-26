package RestAssuredAPITest;

import io.restassured.internal.mapping.Jackson1Mapper;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.*;

public class APITest {

    @Test
    public void getRequest(){
        String endPoint ="https://reqres.in/api/users?page=2";
       ValidatableResponse response = given().when().get(endPoint)
               .then().assertThat().
               statusCode(200)
               .body("data[0].id",equalTo(7))
               .body("data[0].email",equalTo("michael.lawson@reqres.in"))
               .body("data[0].first_name",equalTo("Michael"))
               .body("data[0].last_name",equalTo("Lawson"));
       response.log().body();

    }

    @Test
    public void getRequestValidateResponse() {
        String endPoint = "https://reqres.in/api/users?page=2";
        ValidatableResponse response = given().when().get(endPoint)
                .then().assertThat().
                statusCode(200)
                .body("data.id.size()", equalTo(6))
                .body("data.email.size()",equalTo(6))
                .body("data.id", everyItem(notNullValue()));
        response.log().body();
    }

    @Test
    public void getSingleUserRequest(){
        String endPoint ="https://reqres.in/api";
        ValidatableResponse  response = given().
                contentType("application/json").
                pathParam("users",2)
                .when().
                get(endPoint+"users/{users}")
                .then();
        response.log().body();
        response.log().status();


    }

    @Test
    public void createPostRequest(){
        String endpoint = "https://reqres.in/api/users";
        String body = """
                {
                "name":"Basavaraju S",
                "job" : "Software Engineer - QA"
                }
                """;
        ValidatableResponse response = given().
                                        body(body)
                                         .when()
                                         .post(endpoint)
                                         .then();
        response.log().body();

    }

    @Test
    public void CreatePayloadUsers(){
        String endpoint = "https://reqres.in/api/users";
        Payload body = new Payload("Basavaraju","Sofware Engineer","KG Halli");

       ValidatableResponse response=  given().body(body).when().post(endpoint).then();
       response.log().body();


    }
}

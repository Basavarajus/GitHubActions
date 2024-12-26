package RestAssuredAPITest.APITests;

import RestAssuredAPITest.pojos.pojo2;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.asynchttpclient.RequestBuilder;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class APITest1 {
    private static RequestSpecification requestspecification;
    private static ResponseSpecification responsespecification;



    @BeforeTest
    public void  BeforeSetup(){
        requestspecification = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                //  .addHeader("Authorization", "Bearer " + access_token)
                //  .setBasePath("/v1")
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

        responsespecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();

    }


    @Test
    public void PutMethodAPI(){
        given().spec(requestspecification)
                .body(pojo2.builder().name("Red").job("CS")
                        .build())
                .when().put("/api/users/2").then().spec(responsespecification).assertThat().statusCode(200).
                body("name",equalTo("Red"),"job",equalTo("CS"));
    }
}

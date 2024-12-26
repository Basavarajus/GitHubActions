package RestAssuredAPITest.APITests;

import RestAssuredAPITest.pojos.pojo1;
import RestAssuredAPITest.pojos.pojo2;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;


public class APIMethods {

    private static ResponseSpecification responseSpecification;
    private static RequestSpecification requestSpecification;


    @BeforeClass
    public void beforeClass(){
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
              //  .addHeader("Authorization", "Bearer " + access_token)
              //  .setBasePath("/v1")
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }
    public static pojo1 PojoBuilder1(){
        return pojo1.builder().id(12).name("Basavaraju").Email("estts").phoneNo(00233).Address("sdgd").build();
    }



    @Test
    public static void PostApiRequest(){
        given()
                .spec(requestSpecification)
                .body(pojo2.builder().name("Basavaju").job("IT").build())
                .when().post("/api/users")
                .then().spec(responseSpecification)
                .assertThat().statusCode(201)
                .body("name", equalTo("Basavaju"),
                        "job", equalTo("IT"));
    }





}

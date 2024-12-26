package Interview;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class RestAssured {



    @Test
    public void extract_response(){
        String res = given().baseUri("https://reqres.in/").
                header("","").
                when().
                 get("api/users?page=2").
                then().
                    assertThat().statusCode(200).extract().response().path("data[0].email");
        System.out.println(res);
        assertThat(res,equalTo("michael.lawson@reqres.in"));
        Assert.assertEquals(res,"michael.lawson@reqres.in");

       //System.out.println(JsonPath.from(res).getString("data[0].email"));
        //hamcrest library
      //  System.out.println(js.getString("data[0].email"));
    }
}

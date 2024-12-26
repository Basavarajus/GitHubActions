package RestAssuredAPITest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

public class TestData {

    public static void main(String args[]){
        RestAssured.baseURI = "https://demoqa.com/";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("userId", "TQ123");
        requestParams.put("isbn", "9781449325862");
        request.header("Content-Type", "application/json"); // Add the Json to the body of the request
        Response getResponse= request.get("BookStore/v1/Books");
        System.out.println("response prints here:"+getResponse.getBody().asString());

        request.body(requestParams.toJSONString());
        Response response = request.post("/BookStoreV1BooksPost");
        System.out.println("The status received: " + response.statusLine());
        System.out.print(requestParams);
    }
}

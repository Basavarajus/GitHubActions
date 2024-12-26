package TestCases;

import RestAssuredAPITest.Payload;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class DynamicValueJson {

        @Test
        public void TestMethod1() throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();
            Payload data = objectMapper.readValue(
                    new File(System.getProperty("user.dir")+"/resources/payload.json"),Payload.class);
            System.out.println(data.getJob());
            data.setJob("Test");
            System.out.println(data.getJob());
            System.out.println(data.toString());
        }

    @Test
    public void TestMethod2() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Payload data = objectMapper.readValue(
                new File(System.getProperty("user.dir")+"/resources/payload.json"),Payload.class);
        System.out.println(data.getJob());
        data.setJob("Dev");
        System.out.println(data.getJob());
        System.out.println(data.toString());
    }
}

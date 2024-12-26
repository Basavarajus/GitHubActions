package RestAssuredAPITest;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload {
    private String name ;
    private String job ;
    private String add;


    public Payload(String name,String job,String add){
        setName(name);
        setJob(job);
        setAdd(add);
    }


}

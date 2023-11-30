package api.test;
import api.endpoints.EndPointsURL;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class LoginTests {

    //Verify Response Code
    @Test
    public void Login(){
        Response response = EndPointsURL.getLogin();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(),200);
    }

    //Verify Get Token
    @Test
    public void Logins(){
        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("email", "eve.holt@reqres.in");
        jsonMap.put("password", "cityslicka");

        given().
                contentType("application/json")
                .body(jsonMap)
                .when()
                .post("https://reqres.in/api/login")
                .then().statusCode(200).log().all();

        Assert.assertNotNull(jsonMap);
    }

}

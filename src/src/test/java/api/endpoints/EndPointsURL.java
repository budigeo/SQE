package api.endpoints;
import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class EndPointsURL {

    public static Response getCheckoutTransaction(){
        Response response = given()
                .when()
                .get(BaseURL.api_home_base_url + "/checkout_transaction");
        return response;
    }

    public static Response getUserHistory(){
        Response response = given()
                .when()
                .get(BaseURL.api_home_base_url + "/user_history");
        return response;
    }

    public static Response getPalindrome(String key_name){
        Response response = given()
                .when()
                .get(BaseURL.api_home_base_url + "/palindrome");
        return response;
    }

    public static Response getLogin(){
        Response response = given()
                .when()
                .get(BaseURL.login_url);
        return response;
    }

}

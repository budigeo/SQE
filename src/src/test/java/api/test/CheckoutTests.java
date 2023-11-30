package api.test;
import api.endpoints.EndPointsURL;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTests {

    @Test
    public void testGetCheckoutTransactionDataStatusCode(){
        Response response = EndPointsURL.getCheckoutTransaction();
        response.then().log().all();
        Assert.assertEquals(response.statusCode(),200);
    }

    @Test
    public void testGetCheckoutTransactionDataMandatoryField(){
        Response response = EndPointsURL.getCheckoutTransaction();

        ResponseBody body = response.getBody();

        String bodyObj = body.asString();
        System.out.println("Response : " + bodyObj);
    }
}

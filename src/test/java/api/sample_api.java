package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sample_api {

    @Test
    public void api1(){

       Response res =RestAssured.get("https://reqres.in/api/users?page=2");
       int statuscode = res.getStatusCode();
       Assert.assertEquals(statuscode,200);





    }

}

package com.qa.opencart.utils;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;


import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APIUtil {

public int expectedStatus;
public int actualStatus;
public int expectedPostStatus;
public int actualPostStatus;

    public void getResult(String baseURI ) {
        RestAssured.baseURI = baseURI;
        given().
                queryParam("page", "2")
                .body("");
        when().
                get().
                then().
                assertThat().statusCode(200)
                //.body("total",equalTo(12));
                .body("data[0].id",equalTo(7));

    }


    public void PostResult(String BaseURI)
    {
//        JSONObject request = new JSONObject();
//        request.put("name","Ram");
//        request.put("job","Police");
//
//        System.out.println(request.toJSONString());
//        Response response = RestAssured.post(BaseURI);
//        System.out.println(response.getBody());
//        System.out.println(response.getHeader("Content-Type"));
      RestAssured.baseURI= BaseURI;
      String userdata = "{\"name\":\"morpheus\",\"job\":\"leader\"}";
        given().
               body(userdata).
        when().
               post(BaseURI).
       then().log().all().
                assertThat()
                .statusCode(201)

        .body("id",is(notNullValue()));

//      int expectedPostStatus = 201;
//      int actualPostStatus =response.getStatusCode();

    }

    public void PUTResult(String BaseURI)
    {
        RestAssured.baseURI = BaseURI;
        String userdata= ("{\"name\":\"John\",\"job\":\"Professional\"}");
        given().
                body(userdata).
        when().
                put(baseURI).
    then().log().all().
                assertThat().statusCode(200).
    body("updatedAt",is(notNullValue()));
    }

}

package test_util;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public abstract class Spartan_TestBase {

    @BeforeAll
    public static void path (){

        RestAssured.baseURI = "http://54.166.91.58:8000";
        RestAssured.basePath = "/api";
    }

    @AfterAll
    public static void cleanup (){
        RestAssured.reset();
    }
}

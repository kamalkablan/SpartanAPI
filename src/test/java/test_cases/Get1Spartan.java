package test_cases;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test_util.Spartan_TestBase;

import static io.restassured.RestAssured.get;
@DisplayName("Get All Spartan")

public class Get1Spartan  extends Spartan_TestBase {
    @Test
    public void getAllSpartan (){
        get("/spartans").prettyPeek();
    }

    @Test
    public void getOneSpartan (){
        get("/spartans/100").prettyPeek();
    }
}

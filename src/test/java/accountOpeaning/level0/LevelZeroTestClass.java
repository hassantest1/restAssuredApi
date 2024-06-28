package accountOpeaning.level0;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LevelZeroTestClass extends LevelZeroBaseClass {
    private static final Logger LOGGER = LoggerFactory.getLogger(LevelZeroTestClass.class.getName());

    @Test(dataProvider = "Step_1")
    public void test(String requestBody, Response response){
        LOGGER.info("REQUEST ===> "+requestBody);
        LOGGER.info("RESPONSE ===> "+response.asString());
    }

    @Test
    public void test2(){
        LOGGER.info("REQUEST ===> "+"HELLO WORLD");
        LOGGER.info("RESPONSE ===> "+"ERROR");
    }

}

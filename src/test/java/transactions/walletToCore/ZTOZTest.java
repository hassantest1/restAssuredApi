package transactions.walletToCore;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import zBoxMicroBank.wrappers.Log4jWrapper;

public class ZTOZTest extends ZTOZDataProvider {
    @Test(dataProvider = "Step_1")
    public void test(String JsonResponse){

        System.out.println(JsonResponse);
        Log4jWrapper.error(JsonResponse);
    }
}

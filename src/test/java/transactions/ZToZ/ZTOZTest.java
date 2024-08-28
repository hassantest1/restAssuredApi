package transactions.ZToZ;

import io.restassured.response.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import zBoxMicroBank.extentreports.ExtentTestManager;
import zBoxMicroBank.listiners.AnnotationTransformer;
import zBoxMicroBank.listiners.TestListener;
import zBoxMicroBank.models.transactions.InquieryDto;
import zBoxMicroBank.wrappers.Log4jWrapper;

@Listeners({TestListener.class, AnnotationTransformer.class})
public class ZTOZTest extends ZTOZDataProvider {
    Response responseMain;
    Response responsePaymetn;

    @Test(dataProvider = "inquiryDataProvider")
    public void testInquiry(Response response) {
        responseMain = response;
        ExtentTestManager.startTest("testSuccessCodePositive",
                "Verify API should give SUCCESSCode in response");
        Assert.assertEquals(response.jsonPath().getString("responseCode"), "200101", response.asString());
        System.out.println(response);
        Log4jWrapper.info(response.asString());
    }

    @Test
    public void testInquiryMessage() {
        Response response1 = responseMain;
        ExtentTestManager.startTest("testVerifySuccessResponse",
                "Verify API should give SUCCESS in response");
        Assert.assertEquals(response1.jsonPath().getString("message"), "SUCCESS", response1.asString());
        System.out.println(response1);
        Log4jWrapper.info(response1.asString());
    }

    @Test
    public void testInquiryChannel() {
        Response response2 = responseMain;
        ExtentTestManager.startTest("testVerifyChannelResponse",
                "Verify API should give correct Channel in response");
        Assert.assertEquals(response2.jsonPath().getString("channel"), "4", response2.asString());
        System.out.println(response2);
        Log4jWrapper.info(response2.asString());
    }

    @Test
    public void testInquiryTerminal() {
        Response response3 = responseMain;
        ExtentTestManager.startTest("testVerifyTerminalResponse",
                "Verify API should give correct Terminal in response");
        Assert.assertEquals(response3.jsonPath().getString("terminal"), "1", response3.asString());
        System.out.println(response3);
        Log4jWrapper.info(response3.asString());
    }

    @Test
    public void testInquiryTransactionDate() {
        Response response4 = responseMain;
        ExtentTestManager.startTest("testVerifyTransactionDateResponse",
                "Verify TransactionDate should be in response");
        Assert.assertNotNull(response4.jsonPath().getString("transactionDate"), "Transaction Date should not be null. Response: " + response4.asString());
        System.out.println(response4);
        Log4jWrapper.info(response4.asString());
    }

    @Test
    public void testInquiryStan() {
        Response response5 = responseMain;
        ExtentTestManager.startTest("testVerifyStanResponse",
                "Verify Stan value should not be null in response");
        Assert.assertNotNull(response5.jsonPath().getString("stan"), "STAN should not be null. Response: " + response5.asString());
        System.out.println(response5);
        Log4jWrapper.info(response5.asString());
    }

    @Test
    public void testInquiryRnn() {
        Response response6 = responseMain;
        ExtentTestManager.startTest("testVerifyRnnResponse",
                "Verify Rnn value should not be null in response");
        Assert.assertNotNull(response6.jsonPath().getString("reterivalReferenceNumber"), "Retrieval Reference Number should not be null. Response: " + response6.asString());
        System.out.println(response6);
        Log4jWrapper.info(response6.asString());
    }

    @Test
    public void testInquiryTitle() {
        Response response7 = responseMain;
        ExtentTestManager.startTest("testAccountTitleRnnResponse",
                "Verify AccountTitle in API response");
        Assert.assertEquals(response7.jsonPath().getString("payLoad.accountTitle"), "IJAZ AHMED", response7.asString());
        System.out.println(response7);
        Log4jWrapper.info(response7.asString());
    }

    @Test
    public void testInquiryIsoCode() {
        Response response8 = responseMain;
        ExtentTestManager.startTest("testIsoCodeRnnResponse",
                "Verify IsoCode in API response");
        Assert.assertEquals(response8.jsonPath().getString("isoResponseCode"), "00", response8.asString());
        System.out.println(response8);
        Log4jWrapper.info(response8.asString());
    }

    @Test(dataProvider = "paymentDataProvider")
    public void testPayment(Response response) {
        responsePaymetn = response;
        ExtentTestManager.startTest("testPaymentApiResponseCodePositive",
                "Verify Payment Api Response Code");
        Assert.assertEquals(response.jsonPath().getString("responseCode"), "200101", response.asString());
        System.out.println(response);
        Log4jWrapper.info(response.asString());
    }

    @Test
    public void testPaymentSuccess() {
        Response response10 = responsePaymetn;
        response10 = responseMain;
        ExtentTestManager.startTest("testPaymentApiResponseMessagePositive",
                "Verify Payment Api Response Message");
        Assert.assertEquals(response10.jsonPath().getString("message"), "SUCCESS", response10.asString());
        System.out.println(response10.asString());
        Log4jWrapper.info(response10.asString());
    }

    @Test
    public void testPaymentChannel() {
        Response response11 = responsePaymetn;
        response11 = responseMain;
        ExtentTestManager.startTest("testPaymentChannelPositive",
                "Verify Payment Api Channel value");
        System.out.println(response11.asString());
        Assert.assertEquals(response11.jsonPath().getString("channel"), responseMain.jsonPath().getString("channel"));
        System.out.println(response11);
        Log4jWrapper.info(response11.asString());
    }

    @Test
    public void testPaymentTerminal() {
        Response response12 = responsePaymetn;
        ExtentTestManager.startTest("testPaymentTerminalPositive",
                "Verify Payment Api Terminal value");
        Assert.assertEquals(response12.jsonPath().getString("terminal"), "1", response12.asString());
        System.out.println(response12);
        Log4jWrapper.info(response12.asString());
    }

    @Test
    public void testPaymentTransactionDate() {
        Response response13 = responsePaymetn;
        ExtentTestManager.startTest("testVerifyTransactionDateResponse",
                "Verify TransactionDate should be in response");
        Assert.assertNotNull(response13.jsonPath().getString("transactionDate"), "Transaction Date should not be null. Response: " + response13.asString());
        System.out.println(response13);
        Log4jWrapper.info(response13.asString());
    }

    @Test
    public void testPaymentTransactionStan() {
        Response response14 = responsePaymetn;
        ExtentTestManager.startTest("testVerifyTransactionDateResponse",
                "Verify TransactionDate should be in response");
        Assert.assertNotNull(response14.jsonPath().getString("stan"), "STAN should not be null. Response: " + response14.asString());
        System.out.println(response14);
        Log4jWrapper.info(response14.asString());
    }

//    @Test(dataProvider = "inquiryDataProvider")
//    public void testInquiry(Response response){
//        ExtentTestManager.startTest("testLoginPositive",
//                "Verify user should able to generate ");
//        Assert.assertEquals(response.jsonPath().getString("responseCode"),"200101",response.asString());
//        stan = response.jsonPath().getString("stan");
//        rrn = response.jsonPath().getString("reterivalReferenceNumber");
//        System.out.println(response);
//        Log4jWrapper.info(response.asString());
//    }
//    @Test(dataProvider = "paymentDataProvider")
//    public void testPayment(Response response){
//        ExtentTestManager.startTest("testLoginPositive",
//                "Verify user should be able to login using valid credentials");
//        Assert.assertEquals(response.jsonPath().getString("responseCode"),"200101",response.asString());
//        Assert.assertEquals(response.jsonPath().getString("stan"),stan);
//        Assert.assertEquals(response.jsonPath().getString("reterivalReferenceNumber"),rrn);
//        System.out.println(response);
//        Log4jWrapper.info(response.asString());
//    }
}

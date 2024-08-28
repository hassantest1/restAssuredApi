package transactions.ZToZ;

import io.restassured.response.Response;
import org.junit.runner.Request;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import zBoxMicroBank.constants.ApiUrls;
import zBoxMicroBank.models.common.AccountDataDto;
import zBoxMicroBank.models.transactions.InquieryDto;
import zBoxMicroBank.models.transactions.InquieryDto.AdditionalInformation;
import zBoxMicroBank.models.transactions.InquieryDto.Data;
import zBoxMicroBank.models.transactions.InquieryDto.PayLoad;
import zBoxMicroBank.models.transactions.InquieryDto.Account;
import zBoxMicroBank.models.transactions.InquieryDto.Security;
import zBoxMicroBank.utils.RestAssuredUtils;
import zBoxMicroBank.utils.TestUtils;

import java.util.ArrayList;

public class ZTOZDataProvider {
    private String stan;
    private String rrn;
    private InquieryDto inquieryDto;
    ArrayList<InquieryDto.AdditionalInformation> additionalInfo = new ArrayList<>();
    private Data data;

    @DataProvider(name = "inquiryDataProvider")
    public Object[][] inquiryDataProvider(){
        additionalInfo.add(new AdditionalInformation("",""));
        inquieryDto = new InquieryDto(data = new Data(new Security("ZMFS","ZMFS","ZMFS"),
                new Account("03245062706","","",""),"4","1","000497",null,null,null,null,
                new PayLoad("000000001000","Other",new PayLoad.Account("03439164614","","",""),null,null,null),additionalInfo,""));
        String requestBody = TestUtils.gsonString(inquieryDto);
        Response hashResponse = RestAssuredUtils.postApiResponse(requestBody, ApiUrls.generateTitleFetchHash);
        data.setCheckSum(hashResponse != null ? hashResponse.getBody().asString():"");
        requestBody =TestUtils.gsonString(inquieryDto);
        Response inquiryResponse = RestAssuredUtils.postApiResponse(requestBody,ApiUrls.inquiry);
        stan = inquiryResponse!=null ? inquiryResponse.jsonPath().getString("stan"):"";
        rrn = inquiryResponse!=null ? inquiryResponse.jsonPath().getString("reterivalReferenceNumber"):"";
        return new Object[][]{
                {inquiryResponse}
        };
    }

    @DataProvider(name = "paymentDataProvider")
    public Object[][] paymentDataProvider(){
        data.setAccount(null);
        data.setTransactionCode(null);
        data.getPayLoad().setAccount(null);
        data.getPayLoad().setTransactionAmount("000000001000");
        data.getPayLoad().setPin(new PayLoad.Pin("",""));
        data.getPayLoad().setOtp(new PayLoad.Otp("","",""));
        data.setStan(stan);
        data.setReterivalReferenceNumber(rrn);
        data.setDateAndTime(TestUtils.getDateTime());
        String requestBody = TestUtils.gsonString(inquieryDto);
        Response hashResponse = RestAssuredUtils.postApiResponse(requestBody, ApiUrls.generatePaymentHash);
        data.setCheckSum(hashResponse != null ? hashResponse.getBody().asString():"");
        requestBody =TestUtils.gsonString(inquieryDto);
        System.out.println(requestBody);
        Response paymentResponse = RestAssuredUtils.postApiResponse(requestBody,ApiUrls.payment);
        return new Object[][]{
                {paymentResponse}
        };
    }

}

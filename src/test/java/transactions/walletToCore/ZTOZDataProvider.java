package transactions.walletToCore;

import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import zBoxMicroBank.constants.ApiUrls;
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
    private String inquiryID;
    InquieryDto inquieryDto;
    ArrayList<InquieryDto.AdditionalInformation> additionalInfo = new ArrayList<>();
    Data data;

    @DataProvider(name = "inquiryDataProvider")
    public Object[][] inquiryDataProvider(){
        additionalInfo.add(new AdditionalInformation("",""));
        inquieryDto = new InquieryDto(data = new Data(new Security("ZMFS","ZMFS","ZMFS"),
                new Account("03245062706","","","","586"),"4","1","000497",false,null,null,null,null,
                new PayLoad("000000000100",new PayLoad.Account("03439164614","","","","586"),null,null,null),additionalInfo,""));
        String requestBody = TestUtils.gsonString(inquieryDto);
        Response hashResponse = RestAssuredUtils.postApiResponse(requestBody, ApiUrls.generateTitleFetchHash);
        data.setCheckSum(hashResponse != null ? hashResponse.getBody().asString():"");
        requestBody =TestUtils.gsonString(inquieryDto);
        Response inquiryResponse = RestAssuredUtils.postApiResponse(requestBody,ApiUrls.inquiry);
        inquiryID = inquiryResponse!=null ? inquiryResponse.jsonPath().getString("payLoad.inquiryId"):"";
        return new Object[][]{
                {inquiryResponse != null ? inquiryResponse.getBody().asString():""}
        };
    }

    @DataProvider(name = "paymentDataProvider")
    public Object[][] paymentDataProvider(){
        additionalInfo.add(new AdditionalInformation("",""));
        inquieryDto = new InquieryDto(data = new Data(new Security("ZMFS","ZMFS","ZMFS"),
                null,"4","1","000497",false,TestUtils.getDateTime(),"000008",null,TestUtils.getRetReferenceNumber(),
                new PayLoad(null,null,"",new PayLoad.Pin("",""),new PayLoad.Otp("","","")),additionalInfo,""));
        data.getPayLoad().setInquiryId(inquiryID);
        String requestBody = TestUtils.gsonString(inquieryDto);
        Response hashResponse = RestAssuredUtils.postApiResponse(requestBody, ApiUrls.generatePaymentHash);
        data.setCheckSum(hashResponse != null ? hashResponse.getBody().asString():"");
        requestBody =TestUtils.gsonString(inquieryDto);
        Response paymentResponse = RestAssuredUtils.postApiResponse(requestBody,ApiUrls.payment);
        return new Object[][]{
                {paymentResponse!= null ? paymentResponse.getBody().asString():"",inquieryDto}
        };
    }
}

package accountOpeaning.level0;

import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import zBoxMicroBank.authentication.Login;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.Data;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.PayLoad;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.Security;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.Account;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.DeviceInfo;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.AdditionalParams;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.OriginatorInfo;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.AdditionalInformation;
import zBoxMicroBank.utils.ConfigManager;
import zBoxMicroBank.utils.RestApiRequest;
import zBoxMicroBank.utils.TestUtils;



import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LevelZeroBaseClass {

    public AccountOpeningDto accountOpening;
    public ArrayList<OriginatorInfo> test = new ArrayList<>();
    public ArrayList<AdditionalInformation> additionalInfo = new ArrayList<>();
    public String phoneNumb,cnic;
    public Map<String, Object> getHeaderList;

    @BeforeTest
    public void beforeTest() {
        try {
            ConfigManager getKey = new ConfigManager();
            getHeaderList = new HashMap<>();
            getHeaderList.put("Authorization",getKey.getKeyValue("AUTH_TOKEN"));
            Response response = Login.login(getKey.getKeyValue("user_name"), getKey.getKeyValue("user_pass"));
            getHeaderList.put("Authorization", response.jsonPath().get("payLoad.token"));
            phoneNumb = "0311"+TestUtils.getPhoneNumb();
            cnic = "37405"+TestUtils.getCnicNumb();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("ERROR"+e);
        }
    }

    @DataProvider(name = "Step_1")
    public Object[][] testDataProviderStep1(){
        System.out.println("HEADERS==>"+getHeaderList.toString());
        test.add(new OriginatorInfo("",""));
        additionalInfo.add(new AdditionalInformation("",""));
        accountOpening = new AccountOpeningDto(new Data(new Security("","",""),
                new Account("","","","",""),"","","","",additionalInfo,new PayLoad("","03110553909","","",
                "","","","","","","",
                "","","1","","",new DeviceInfo("","","","",
                "","","","","","","","","",
                "","","",new AdditionalParams("","","")),"","","","","",
                "", test,"","","","","","")));

        String request_json_body = TestUtils.gsonString(accountOpening);
        System.out.println("LOG===>"+request_json_body);
        Response apiResponse = RestApiRequest.postApiResponse(getHeaderList,request_json_body,"/account/v1/customeraccounts/createaccount");
        System.out.println("LOG===>"+apiResponse.asString());
        return new Object[][]{{request_json_body,apiResponse}};
    }

    @DataProvider(name = "Step_2")
    public Object[][] testDataProviderStep2(){
        accountOpening.getData().getPayLoad().setCnic("3740563806335");
        accountOpening.getData().getPayLoad().setStep("2");
        String request_json_body = TestUtils.gsonString(accountOpening);
        return new Object[][]{
                {request_json_body}
        };
    }

    @DataProvider(name = "Step_3")
    public Object[][] testDataProviderStep3(){
        accountOpening.getData().getPayLoad().setStep("4");
        accountOpening.getData().getPayLoad().setCnicIssuanceDate("2016-10-10");
        accountOpening.getData().getPayLoad().setEmail("test@gmail.com");
        String request_json_body = TestUtils.gsonString(accountOpening);
        return new Object[][]{
                {request_json_body}
        };
    }
}

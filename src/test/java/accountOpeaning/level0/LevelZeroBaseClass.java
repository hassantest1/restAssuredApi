package accountOpeaning.level0;

import org.testng.annotations.DataProvider;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.Data;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.PayLoad;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.Security;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.Account;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.DeviceInfo;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.AdditionalParams;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.OriginatorInfo;
import zBoxMicroBank.models.accountOpeaningModel.AccountOpeningDto.AdditionalInformation;
import zBoxMicroBank.utils.TestUtils;

import java.util.ArrayList;

public class LevelZeroBaseClass {

    AccountOpeningDto accountOpening;
    ArrayList<OriginatorInfo> test = new ArrayList<>();
    ArrayList<AdditionalInformation> additionalInfo = new ArrayList<>();

    @DataProvider(name = "Step_1")
    public Object[][] testDataProviderStep1(){
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
        return new Object[][]{
                {request_json_body}
        };
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

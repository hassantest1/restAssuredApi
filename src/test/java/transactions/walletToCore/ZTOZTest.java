package transactions.walletToCore;

import org.testng.annotations.Test;
import zBoxMicroBank.models.transactions.InquieryDto;
import zBoxMicroBank.utils.TestUtils;
import zBoxMicroBank.wrappers.Log4jWrapper;

public class ZTOZTest extends ZTOZDataProvider {
    @Test(dataProvider = "inquiryDataProvider")
    public void testInquiry(String response){
        System.out.println(response);
        Log4jWrapper.info(response);
    }

    @Test(dataProvider = "paymentDataProvider")
    public void testPayment(String response, InquieryDto inquieryDto){
        System.out.println("INQ=>"+inquieryDto.getData().getPayLoad().toString());
        System.out.println(response);
        Log4jWrapper.info(response);
    }
}

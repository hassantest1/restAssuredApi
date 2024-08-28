package zBoxMicroBank.models.transactions;


import zBoxMicroBank.models.common.AccountDataDto;

import java.util.ArrayList;

public class InquieryDto {

    public InquieryDto(InquieryDto.Data data){
        this.data = data;
    }
    public InquieryDto.Data data;

    public InquieryDto.Data getData() {
        return data;
    }

    public void setData(InquieryDto.Data data) {
        this.data = data;
    }

    public static class Data{

        public Data(Security security, Account account, String channel, String terminal, String productId, String dateAndTime,String stan,String transactionCode, String reterivalReferenceNumber, PayLoad payLoad, ArrayList<AdditionalInformation> additionalInformation, String checkSum) {
            this.security = security;
            this.account = account;
            this.channel = channel;
            this.terminal = terminal;
            this.productCode = productId;
            this.dateAndTime = dateAndTime;
            this.stan=stan;
            this.transactionCode = transactionCode;
            this.reterivalReferenceNumber = reterivalReferenceNumber;
            this.payLoad = payLoad;
            this.additionalInformation = additionalInformation;
            this.checkSum = checkSum;
        }

        public InquieryDto.Security security;
        public InquieryDto.Account account;
        public String channel;
        public String terminal;
        public String productCode;

        public String dateAndTime;
        public String stan;
        public String transactionCode;
        public String reterivalReferenceNumber;
        public PayLoad payLoad;
        public ArrayList<InquieryDto.AdditionalInformation> additionalInformation;
        public String checkSum;

        public String getStan() {
            return stan;
        }

        public void setStan(String stan) {
            this.stan = stan;
        }

        public Security getSecurity() {
            return security;
        }

        public void setSecurity(Security security) {
            this.security = security;
        }

        public Account getAccount() {
            return account;
        }

        public void setAccount(Account account) {
            this.account = account;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getTerminal() {
            return terminal;
        }

        public void setTerminal(String terminal) {
            this.terminal = terminal;
        }

        public String getProductCode() {
            return productCode;
        }

        public void setProductCode(String productCode) {
            this.productCode = productCode;
        }

        public String getDateAndTime() {
            return dateAndTime;
        }

        public void setDateAndTime(String dateAndTime) {
            this.dateAndTime = dateAndTime;
        }

        public String getTransactionCode() {
            return transactionCode;
        }

        public void setTransactionCode(String transactionCode) {
            this.transactionCode = transactionCode;
        }

        public String getReterivalReferenceNumber() {
            return reterivalReferenceNumber;
        }

        public void setReterivalReferenceNumber(String reterivalReferenceNumber) {
            this.reterivalReferenceNumber = reterivalReferenceNumber;
        }

        public PayLoad getPayLoad() {
            return payLoad;
        }

        public void setPayLoad(PayLoad payLoad) {
            this.payLoad = payLoad;
        }

        public ArrayList<AdditionalInformation> getAdditionalInformation() {
            return additionalInformation;
        }

        public void setAdditionalInformation(ArrayList<AdditionalInformation> additionalInformation) {
            this.additionalInformation = additionalInformation;
        }

        public String getCheckSum() {
            return checkSum;
        }

        public void setCheckSum(String checkSum) {
            this.checkSum = checkSum;
        }
    }

    public static class Security{

        public Security(String userName,String password, String securityToken){
            this.userName = userName;
            this.password = password;
            this.securityToken = securityToken;
        }

        public String userName;
        public String password;
        public String securityToken;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSecurityToken() {
            return securityToken;
        }

        public void setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
        }


    }

    public static class Account{
        public String msidn;
        public String iban;
        public String bban;
        public String pan;


        public Account(String msidn, String iban,String bban, String pan){
            this.msidn = msidn;
            this.iban = iban;
            this.bban = bban;
            this.pan = pan;

        }

        public String getMsidn() {
            return msidn;
        }

        public void setMsidn(String msidn) {
            this.msidn = msidn;
        }

        public String getIban() {
            return iban;
        }

        public void setIban(String iban) {
            this.iban = iban;
        }

        public String getBban() {
            return bban;
        }

        public void setBban(String bban) {
            this.bban = bban;
        }

        public String getPan() {
            return pan;
        }

        public void setPan(String pan) {
            this.pan = pan;
        }

    }

    public static class AdditionalInformation{
        public AdditionalInformation(String infoKey, String infoValue) {
            this.infoKey = infoKey;
            this.infoValue = infoValue;
        }

        public String infoKey;
        public String infoValue;

        public String getInfoKey() {
            return infoKey;
        }

        public void setInfoKey(String infoKey) {
            this.infoKey = infoKey;
        }

        public String getInfoValue() {
            return infoValue;
        }

        public void setInfoValue(String infoValue) {
            this.infoValue = infoValue;
        }
    }

    public static class AdditionalParams{
        public AdditionalParams(String additionalProp1, String additionalProp2, String additionalProp3) {
            this.additionalProp1 = additionalProp1;
            this.additionalProp2 = additionalProp2;
            this.additionalProp3 = additionalProp3;
        }

        public String additionalProp1;
        public String additionalProp2;

        public String additionalProp3;

        public String getAdditionalProp1() {
            return additionalProp1;
        }

        public void setAdditionalProp1(String additionalProp1) {
            this.additionalProp1 = additionalProp1;
        }

        public String getAdditionalProp2() {
            return additionalProp2;
        }

        public void setAdditionalProp2(String additionalProp2) {
            this.additionalProp2 = additionalProp2;
        }

        public String getAdditionalProp3() {
            return additionalProp3;
        }

        public void setAdditionalProp3(String additionalProp3) {
            this.additionalProp3 = additionalProp3;
        }

    }

    public static class PayLoad {
        public PayLoad(String transactionAmount, String purposeOfPayment, Account account,String inquiryId,Pin pin,Otp otp) {
            this.transactionAmount = transactionAmount;
            this.purposeOfPayment = purposeOfPayment;
            this.account = account;
            this.inquiryId = inquiryId;
            this.pin=pin;
            this.otp=otp;
        }

        public String transactionAmount;
        public String purposeOfPayment;
        public String inquiryId;
        public Account account;
        public Pin pin;
        public Otp otp;

        public Pin getPin() {
            return pin;
        }

        public void setPin(Pin pin) {
            this.pin = pin;
        }

        public Otp getOtp() {
            return otp;
        }

        public void setOtp(Otp otp) {
            this.otp = otp;
        }

        public Account getAccount() {
            return account;
        }
        public void setAccount(Account account) {
            this.account = account;
        }
        public String getTransactionAmount() {
            return transactionAmount;
        }
        public void setTransactionAmount(String transactionAmount) {
            this.transactionAmount = transactionAmount;
        }
        public String getInquiryId() {
            return inquiryId;
        }
        public void setInquiryId(String inquiryId) {
            this.inquiryId = inquiryId;
        }
        public String getPurposeOfPayment() {
            return purposeOfPayment;
        }
        public void setPurposeOfPayment(String purposeOfPayment) {
            this.purposeOfPayment = purposeOfPayment;
        }
        public static class Account{
            public String msidn;
            public String iban;
            public String bban;
            public String pan;


            public Account(String msidn, String iban, String bban, String pan) {
                this.msidn = msidn;
                this.iban = iban;
                this.bban = bban;
                this.pan = pan;

            }

            public String getMsidn() {
                return msidn;
            }

            public void setMsidn(String msidn) {
                this.msidn = msidn;
            }

            public String getIban() {
                return iban;
            }

            public void setIban(String iban) {
                this.iban = iban;
            }

            public String getBban() {
                return bban;
            }

            public void setBban(String bban) {
                this.bban = bban;
            }

            public String getPan() {
                return pan;
            }

            public void setPan(String pan) {
                this.pan = pan;
            }


        }
        public static class Pin{
            public String pinType;
            public String pin;

            public Pin(String pinType, String pin) {
                this.pinType = pinType;
                this.pin = pin;
            }

            public String getPinType() {
                return pinType;
            }

            public void setPinType(String pinType) {
                this.pinType = pinType;
            }

            public String getPin() {
                return pin;
            }

            public void setPin(String pin) {
                this.pin = pin;
            }
        }
        public static class Otp{
            public String otpType;
            public String otpId;
            public String otpPin;

            public Otp(String otpType, String otpId, String otpPin) {
                this.otpType = otpType;
                this.otpId = otpId;
                this.otpPin = otpPin;
            }

            public String getOtpType() {
                return otpType;
            }

            public void setOtpType(String otpType) {
                this.otpType = otpType;
            }

            public String getOtpId() {
                return otpId;
            }

            public void setOtpId(String otpId) {
                this.otpId = otpId;
            }

            public String getOtpPin() {
                return otpPin;
            }

            public void setOtpPin(String otpPin) {
                this.otpPin = otpPin;
            }
        }

    }
}

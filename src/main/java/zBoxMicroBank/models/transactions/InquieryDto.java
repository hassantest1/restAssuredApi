package zBoxMicroBank.models.transactions;


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

        public Data(Security security, Account account, String channel, String terminal, String productId,boolean performCLS, String dateAndTime, String transactionCode, String reterivalReferenceNumber, PayLoad payLoad, ArrayList<AdditionalInformation> additionalInformation, String checkSum) {
            this.security = security;
            this.account = account;
            this.channel = channel;
            this.terminal = terminal;
            this.productCode = productId;
            this.performCLS = performCLS;
            this.dateAndTime = dateAndTime;
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
        public boolean performCLS;
        public String dateAndTime;
        public String transactionCode;
        public String reterivalReferenceNumber;
        public InquieryDto.PayLoad payLoad;
        public ArrayList<InquieryDto.AdditionalInformation> additionalInformation;
        public String checkSum;

        public boolean isPerformCLS() {
            return performCLS;
        }

        public void setPerformCLS(boolean performCLS) {
            this.performCLS = performCLS;
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
        public String currency;

        public Account(String msidn, String iban,String bban, String pan, String currency){
            this.msidn = msidn;
            this.iban = iban;
            this.bban = bban;
            this.pan = pan;
            this.currency = currency;
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

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
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

        public PayLoad(String transactionAmount, Account account) {
            this.transactionAmount = transactionAmount;
            this.account = account;
        }

        public String transactionAmount;
        public Account account;

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

        public static class Account{
            public String msidn;
            public String iban;
            public String bban;
            public String pan;
            public String currency;

            public Account(String msidn, String iban, String bban, String pan, String currency) {
                this.msidn = msidn;
                this.iban = iban;
                this.bban = bban;
                this.pan = pan;
                this.currency = currency;
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

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

        }


    }
}
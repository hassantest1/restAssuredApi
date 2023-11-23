package zBoxMicroBank.models.accountOpeaningModel;

import java.util.ArrayList;

public class AccountOpeningDto {

    public AccountOpeningDto(Data data){
        this.data = data;
    }
    public Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data{

        public Data(Security security, Account account,String channel,
                    String terminal,String reterivalReferenceNumber,
                    String checkSum,ArrayList<AdditionalInformation> additionalInformation,PayLoad payLoad){
            this.security = security;
            this.account=account;
            this.channel=channel;
            this.terminal=terminal;
            this.reterivalReferenceNumber=reterivalReferenceNumber;
            this.checkSum=checkSum;
            this.additionalInformation = additionalInformation;
            this.payLoad = payLoad;
        }

        public Security security;
        public Account account;
        public String channel;
        public String terminal;
        public String reterivalReferenceNumber;
        public PayLoad payLoad;
        public ArrayList<AdditionalInformation> additionalInformation;
        public String checkSum;
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

    public static class DeviceInfo{

        public DeviceInfo(String appVersionCode, String appVersionName, String osVersion,
                          String deviceId, String deviceModel, String networkType, String networkOperator,
                          String androidApiLevel, String googlePlayServiceVersion, String ipAddress, String resolution,
                          String density, String screenSize, String uuid, String deviceType, String deviceName, AdditionalParams additionalParams) {
            this.appVersionCode = appVersionCode;
            this.appVersionName = appVersionName;
            this.osVersion = osVersion;
            this.deviceId = deviceId;
            this.deviceModel = deviceModel;
            this.networkType = networkType;
            this.networkOperator = networkOperator;
            this.androidApiLevel = androidApiLevel;
            this.googlePlayServiceVersion = googlePlayServiceVersion;
            this.ipAddress = ipAddress;
            this.resolution = resolution;
            this.density = density;
            this.screenSize = screenSize;
            this.uuid = uuid;
            this.deviceType = deviceType;
            this.deviceName = deviceName;
            this.additionalParams = additionalParams;
        }

        public String appVersionCode;
        public String appVersionName;
        public String osVersion;
        public String deviceId;
        public String deviceModel;
        public String networkType;
        public String networkOperator;
        public String androidApiLevel;
        public String googlePlayServiceVersion;
        public String ipAddress;
        public String resolution;
        public String density;
        public String screenSize;
        public String uuid;
        public String deviceType;
        public String deviceName;
        public AdditionalParams additionalParams;

        public String getAppVersionCode() {
            return appVersionCode;
        }

        public void setAppVersionCode(String appVersionCode) {
            this.appVersionCode = appVersionCode;
        }

        public String getAppVersionName() {
            return appVersionName;
        }

        public void setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
        }

        public String getOsVersion() {
            return osVersion;
        }

        public void setOsVersion(String osVersion) {
            this.osVersion = osVersion;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getDeviceModel() {
            return deviceModel;
        }

        public void setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
        }

        public String getNetworkType() {
            return networkType;
        }

        public void setNetworkType(String networkType) {
            this.networkType = networkType;
        }

        public String getNetworkOperator() {
            return networkOperator;
        }

        public void setNetworkOperator(String networkOperator) {
            this.networkOperator = networkOperator;
        }

        public String getAndroidApiLevel() {
            return androidApiLevel;
        }

        public void setAndroidApiLevel(String androidApiLevel) {
            this.androidApiLevel = androidApiLevel;
        }

        public String getGooglePlayServiceVersion() {
            return googlePlayServiceVersion;
        }

        public void setGooglePlayServiceVersion(String googlePlayServiceVersion) {
            this.googlePlayServiceVersion = googlePlayServiceVersion;
        }

        public String getIpAddress() {
            return ipAddress;
        }

        public void setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
        }

        public String getResolution() {
            return resolution;
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        public String getDensity() {
            return density;
        }

        public void setDensity(String density) {
            this.density = density;
        }

        public String getScreenSize() {
            return screenSize;
        }

        public void setScreenSize(String screenSize) {
            this.screenSize = screenSize;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(String deviceType) {
            this.deviceType = deviceType;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }

        public AdditionalParams getAdditionalParams() {
            return additionalParams;
        }

        public void setAdditionalParams(AdditionalParams additionalParams) {
            this.additionalParams = additionalParams;
        }


    }

    public static class OriginatorInfo{
        public String countryName;
        public String relationshipName;

        public OriginatorInfo(String countryName, String relationshipName) {
            this.countryName = countryName;
            this.relationshipName = relationshipName;
        }
        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public String getRelationshipName() {
            return relationshipName;
        }

        public void setRelationshipName(String relationshipName) {
            this.relationshipName = relationshipName;
        }

    }

    public static class PayLoad{
        public PayLoad(String cnic, String mobileNumber,
                       String cnicIssuanceDate, String email,
                       String otpPin, String fullName, String segmentName,
                       String currencyCode, String verifyOtpPinId, String channelName,
                       String pin, String confirmMpin, String motherName, String step, String updateStatusComments, String tAndCAccepted,
                       DeviceInfo deviceInfo, String name, String fatherName, String dob, String accountPurposeName,
                       String occupationName, String sourceOfIncomeName, ArrayList<OriginatorInfo> originatorInfo,
                       String nokName, String nokCnic, String nokMobileNo, String nokRelationshipName, String screenStep, String accounttype) {
            this.cnic = cnic;
            this.mobileNumber = mobileNumber;
            this.cnicIssuanceDate = cnicIssuanceDate;
            this.email = email;
            this.otpPin = otpPin;
            this.fullName = fullName;
            this.segmentName = segmentName;
            this.currencyCode = currencyCode;
            this.verifyOtpPinId = verifyOtpPinId;
            this.channelName = channelName;
            this.pin = pin;
            this.confirmMpin = confirmMpin;
            this.motherName = motherName;
            this.step = step;
            this.updateStatusComments = updateStatusComments;
            this.tAndCAccepted = tAndCAccepted;
            this.deviceInfo = deviceInfo;
            this.name = name;
            this.fatherName = fatherName;
            this.dob = dob;
            this.accountPurposeName = accountPurposeName;
            this.occupationName = occupationName;
            this.sourceOfIncomeName = sourceOfIncomeName;
            this.originatorInfo = originatorInfo;
            this.nokName = nokName;
            this.nokCnic = nokCnic;
            this.nokMobileNo = nokMobileNo;
            this.nokRelationshipName = nokRelationshipName;
            this.screenStep = screenStep;
            this.accounttype = accounttype;
        }

        public String cnic;
        public String mobileNumber;
        public String cnicIssuanceDate;
        public String email;
        public String otpPin;
        public String fullName;
        public String segmentName;
        public String currencyCode;
        public String verifyOtpPinId;
        public String channelName;
        public String pin;
        public String confirmMpin;
        public String motherName;
        public String step;
        public String updateStatusComments;
        public DeviceInfo deviceInfo;

        public String name;
        public String fatherName;
        public String dob;
        public String accountPurposeName;
        public String occupationName;
        public String sourceOfIncomeName;
        public ArrayList<OriginatorInfo> originatorInfo;
        public String nokName;
        public String nokCnic;
        public String nokMobileNo;
        public String nokRelationshipName;
        public String screenStep;
        public String accounttype;

        public String tAndCAccepted;

        public String gettAndCAccepted() {
            return tAndCAccepted;
        }

        public void settAndCAccepted(String tAndCAccepted) {
            this.tAndCAccepted = tAndCAccepted;
        }


        public String getCnic() {
            return cnic;
        }

        public void setCnic(String cnic) {
            this.cnic = cnic;
        }

        public String getMobileNumber() {
            return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }

        public String getCnicIssuanceDate() {
            return cnicIssuanceDate;
        }

        public void setCnicIssuanceDate(String cnicIssuanceDate) {
            this.cnicIssuanceDate = cnicIssuanceDate;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getOtpPin() {
            return otpPin;
        }

        public void setOtpPin(String otpPin) {
            this.otpPin = otpPin;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getSegmentName() {
            return segmentName;
        }

        public void setSegmentName(String segmentName) {
            this.segmentName = segmentName;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public String getVerifyOtpPinId() {
            return verifyOtpPinId;
        }

        public void setVerifyOtpPinId(String verifyOtpPinId) {
            this.verifyOtpPinId = verifyOtpPinId;
        }

        public String getChannelName() {
            return channelName;
        }

        public void setChannelName(String channelName) {
            this.channelName = channelName;
        }

        public String getPin() {
            return pin;
        }

        public void setPin(String pin) {
            this.pin = pin;
        }

        public String getConfirmMpin() {
            return confirmMpin;
        }

        public void setConfirmMpin(String confirmMpin) {
            this.confirmMpin = confirmMpin;
        }

        public String getMotherName() {
            return motherName;
        }

        public void setMotherName(String motherName) {
            this.motherName = motherName;
        }

        public String getStep() {
            return step;
        }

        public void setStep(String step) {
            this.step = step;
        }

        public String getUpdateStatusComments() {
            return updateStatusComments;
        }

        public void setUpdateStatusComments(String updateStatusComments) {
            this.updateStatusComments = updateStatusComments;
        }

        public DeviceInfo getDeviceInfo() {
            return deviceInfo;
        }

        public void setDeviceInfo(DeviceInfo deviceInfo) {
            this.deviceInfo = deviceInfo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFatherName() {
            return fatherName;
        }

        public void setFatherName(String fatherName) {
            this.fatherName = fatherName;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getAccountPurposeName() {
            return accountPurposeName;
        }

        public void setAccountPurposeName(String accountPurposeName) {
            this.accountPurposeName = accountPurposeName;
        }

        public String getOccupationName() {
            return occupationName;
        }

        public void setOccupationName(String occupationName) {
            this.occupationName = occupationName;
        }

        public String getSourceOfIncomeName() {
            return sourceOfIncomeName;
        }

        public void setSourceOfIncomeName(String sourceOfIncomeName) {
            this.sourceOfIncomeName = sourceOfIncomeName;
        }

        public ArrayList<OriginatorInfo> getOriginatorInfo() {
            return originatorInfo;
        }

        public void setOriginatorInfo(ArrayList<OriginatorInfo> originatorInfo) {
            this.originatorInfo = originatorInfo;
        }

        public String getNokName() {
            return nokName;
        }

        public void setNokName(String nokName) {
            this.nokName = nokName;
        }

        public String getNokCnic() {
            return nokCnic;
        }

        public void setNokCnic(String nokCnic) {
            this.nokCnic = nokCnic;
        }

        public String getNokMobileNo() {
            return nokMobileNo;
        }

        public void setNokMobileNo(String nokMobileNo) {
            this.nokMobileNo = nokMobileNo;
        }

        public String getNokRelationshipName() {
            return nokRelationshipName;
        }

        public void setNokRelationshipName(String nokRelationshipName) {
            this.nokRelationshipName = nokRelationshipName;
        }

        public String getScreenStep() {
            return screenStep;
        }

        public void setScreenStep(String screenStep) {
            this.screenStep = screenStep;
        }

        public String getAccounttype() {
            return accounttype;
        }

        public void setAccounttype(String accounttype) {
            this.accounttype = accounttype;
        }
    }

}

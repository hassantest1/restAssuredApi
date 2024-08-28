package zBoxMicroBank.models.common;


import zBoxMicroBank.models.transactions.InquieryDto;

public class AccountDataDto{

    public InquieryDto.Data data;

    public InquieryDto.Data getData() {
        return data;
    }

    public void setData(InquieryDto.Data data) {
        this.data = data;
    }

    public void setData(Data data) {
    }

    public static class Data{

        public PayLoad payload;

        public PayLoad getPayload() {
            return payload;
        }

        public void setPayload(PayLoad payload) {
            this.payload = payload;
        }
        
    }
    
    public static class PayLoad {
        public String accountClassificationId;
        public String msidn;
        public String accountId;
        public String accountLevelCode;
        public String accountLevelDescr;
        public String accountLevelId;
        public String accountLevelName;
        public String accountNo;
        public String accountStatusName;
        public String accountTitle;
        public String accountTypeName;
        public String actualBalance;
        public String agentId;
        public String availableBalance;
        public String blacklist;
        public String cbsAccountCode;
        public String cnic;
        public String cnicHash;
        public String consumedDailyAmtLimitCr;
        public String consumedDailyAmtLimitDr;
        public String consumedDailyTransLimitCr;
        public String consumedDailyTransLimitDr;
        public String consumedMonthlyAmtLimitCr;
        public String consumedMonthlyAmtLimitDr;
        public String consumedMonthlyTransLimitCr;
        public String consumedMonthlyTransLimitDr;
        public String consumedYearlyAmtLimitCr;
        public String consumedYearlyAmtLimitDr;
        public String consumedYearlyTransLimitCr;
        public String consumedYearlyTransLimitDr;
        public String createdate;
        public String currencyCode;
        public String finAccountCode;
        public String iban;
        public String maxAmtLimit;
        public String maxAmtPerTxn;
        public String mobileNo;
        public String mobileNoHash;
        public String registrationTypeName;
        public String remainingDailyAmtLimitCr;
        public String remainingDailyAmtLimitDr;
        public String remainingDailyTransLimitCr;
        public String remainingDailyTransLimitDr;
        public String remainingMonthlyAmtLimitCr;
        public String remainingMonthlyAmtLimitDr;
        public String remainingMonthlyTransLimitCr;
        public String remainingMonthlyTransLimitDr;
        public String remainingYearlyAmtLimitCr;
        public String remainingYearlyAmtLimitDr;
        public String remainingYearlyTransLimitCr;
        public String remainingYearlyTransLimitDr;
        public String segmentId;
        public String totalDailyAmtLimitCr;
        public String totalDailyAmtLimitDr;
        public String totalDailyTransLimitCr;
        public String totalDailyTransLimitDr;
        public String totalMonthlyAmtLimitCr;
        public String totalMonthlyAmtLimitDr;
        public String totalMonthlyTransLimitCr;
        public String totalMonthlyTransLimitDr;
        public String totalYearlyAmtLimitCr;
        public String totalYearlyAmtLimitDr;
        public String totalYearlyTransLimitCr;
        public String totalYearlyTransLimitDr;
        public String isoCode;

        public String getAccountClassificationId() {
            return accountClassificationId;
        }

        public void setAccountClassificationId(String accountClassificationId) {
            this.accountClassificationId = accountClassificationId;
        }

        public String getMsidn() {
            return msidn;
        }

        public void setMsidn(String msidn) {
            this.msidn = msidn;
        }

        public String getAccountId() {
            return accountId;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        public String getAccountLevelCode() {
            return accountLevelCode;
        }

        public void setAccountLevelCode(String accountLevelCode) {
            this.accountLevelCode = accountLevelCode;
        }

        public String getAccountLevelDescr() {
            return accountLevelDescr;
        }

        public void setAccountLevelDescr(String accountLevelDescr) {
            this.accountLevelDescr = accountLevelDescr;
        }

        public String getAccountLevelId() {
            return accountLevelId;
        }

        public void setAccountLevelId(String accountLevelId) {
            this.accountLevelId = accountLevelId;
        }

        public String getAccountLevelName() {
            return accountLevelName;
        }

        public void setAccountLevelName(String accountLevelName) {
            this.accountLevelName = accountLevelName;
        }

        public String getAccountNo() {
            return accountNo;
        }

        public void setAccountNo(String accountNo) {
            this.accountNo = accountNo;
        }

        public String getAccountStatusName() {
            return accountStatusName;
        }

        public void setAccountStatusName(String accountStatusName) {
            this.accountStatusName = accountStatusName;
        }

        public String getAccountTitle() {
            return accountTitle;
        }

        public void setAccountTitle(String accountTitle) {
            this.accountTitle = accountTitle;
        }

        public String getAccountTypeName() {
            return accountTypeName;
        }

        public void setAccountTypeName(String accountTypeName) {
            this.accountTypeName = accountTypeName;
        }

        public String getActualBalance() {
            return actualBalance;
        }

        public void setActualBalance(String actualBalance) {
            this.actualBalance = actualBalance;
        }

        public String getAgentId() {
            return agentId;
        }

        public void setAgentId(String agentId) {
            this.agentId = agentId;
        }

        public String getAvailableBalance() {
            return availableBalance;
        }

        public void setAvailableBalance(String availableBalance) {
            this.availableBalance = availableBalance;
        }

        public String getBlacklist() {
            return blacklist;
        }

        public void setBlacklist(String blacklist) {
            this.blacklist = blacklist;
        }

        public String getCbsAccountCode() {
            return cbsAccountCode;
        }

        public void setCbsAccountCode(String cbsAccountCode) {
            this.cbsAccountCode = cbsAccountCode;
        }

        public String getCnic() {
            return cnic;
        }

        public void setCnic(String cnic) {
            this.cnic = cnic;
        }

        public String getCnicHash() {
            return cnicHash;
        }

        public void setCnicHash(String cnicHash) {
            this.cnicHash = cnicHash;
        }

        public String getConsumedDailyAmtLimitCr() {
            return consumedDailyAmtLimitCr;
        }

        public void setConsumedDailyAmtLimitCr(String consumedDailyAmtLimitCr) {
            this.consumedDailyAmtLimitCr = consumedDailyAmtLimitCr;
        }

        public String getConsumedDailyAmtLimitDr() {
            return consumedDailyAmtLimitDr;
        }

        public void setConsumedDailyAmtLimitDr(String consumedDailyAmtLimitDr) {
            this.consumedDailyAmtLimitDr = consumedDailyAmtLimitDr;
        }

        public String getConsumedDailyTransLimitCr() {
            return consumedDailyTransLimitCr;
        }

        public void setConsumedDailyTransLimitCr(String consumedDailyTransLimitCr) {
            this.consumedDailyTransLimitCr = consumedDailyTransLimitCr;
        }

        public String getConsumedDailyTransLimitDr() {
            return consumedDailyTransLimitDr;
        }

        public void setConsumedDailyTransLimitDr(String consumedDailyTransLimitDr) {
            this.consumedDailyTransLimitDr = consumedDailyTransLimitDr;
        }

        public String getConsumedMonthlyAmtLimitCr() {
            return consumedMonthlyAmtLimitCr;
        }

        public void setConsumedMonthlyAmtLimitCr(String consumedMonthlyAmtLimitCr) {
            this.consumedMonthlyAmtLimitCr = consumedMonthlyAmtLimitCr;
        }

        public String getConsumedMonthlyAmtLimitDr() {
            return consumedMonthlyAmtLimitDr;
        }

        public void setConsumedMonthlyAmtLimitDr(String consumedMonthlyAmtLimitDr) {
            this.consumedMonthlyAmtLimitDr = consumedMonthlyAmtLimitDr;
        }

        public String getConsumedMonthlyTransLimitCr() {
            return consumedMonthlyTransLimitCr;
        }

        public void setConsumedMonthlyTransLimitCr(String consumedMonthlyTransLimitCr) {
            this.consumedMonthlyTransLimitCr = consumedMonthlyTransLimitCr;
        }

        public String getConsumedMonthlyTransLimitDr() {
            return consumedMonthlyTransLimitDr;
        }

        public void setConsumedMonthlyTransLimitDr(String consumedMonthlyTransLimitDr) {
            this.consumedMonthlyTransLimitDr = consumedMonthlyTransLimitDr;
        }

        public String getConsumedYearlyAmtLimitCr() {
            return consumedYearlyAmtLimitCr;
        }

        public void setConsumedYearlyAmtLimitCr(String consumedYearlyAmtLimitCr) {
            this.consumedYearlyAmtLimitCr = consumedYearlyAmtLimitCr;
        }

        public String getConsumedYearlyAmtLimitDr() {
            return consumedYearlyAmtLimitDr;
        }

        public void setConsumedYearlyAmtLimitDr(String consumedYearlyAmtLimitDr) {
            this.consumedYearlyAmtLimitDr = consumedYearlyAmtLimitDr;
        }

        public String getConsumedYearlyTransLimitCr() {
            return consumedYearlyTransLimitCr;
        }

        public void setConsumedYearlyTransLimitCr(String consumedYearlyTransLimitCr) {
            this.consumedYearlyTransLimitCr = consumedYearlyTransLimitCr;
        }

        public String getConsumedYearlyTransLimitDr() {
            return consumedYearlyTransLimitDr;
        }

        public void setConsumedYearlyTransLimitDr(String consumedYearlyTransLimitDr) {
            this.consumedYearlyTransLimitDr = consumedYearlyTransLimitDr;
        }

        public String getCreatedate() {
            return createdate;
        }

        public void setCreatedate(String createdate) {
            this.createdate = createdate;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
        }

        public String getFinAccountCode() {
            return finAccountCode;
        }

        public void setFinAccountCode(String finAccountCode) {
            this.finAccountCode = finAccountCode;
        }

        public String getIban() {
            return iban;
        }

        public void setIban(String iban) {
            this.iban = iban;
        }

        public String getMaxAmtLimit() {
            return maxAmtLimit;
        }

        public void setMaxAmtLimit(String maxAmtLimit) {
            this.maxAmtLimit = maxAmtLimit;
        }

        public String getMaxAmtPerTxn() {
            return maxAmtPerTxn;
        }

        public void setMaxAmtPerTxn(String maxAmtPerTxn) {
            this.maxAmtPerTxn = maxAmtPerTxn;
        }

        public String getMobileNo() {
            return mobileNo;
        }

        public void setMobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
        }

        public String getMobileNoHash() {
            return mobileNoHash;
        }

        public void setMobileNoHash(String mobileNoHash) {
            this.mobileNoHash = mobileNoHash;
        }

        public String getRegistrationTypeName() {
            return registrationTypeName;
        }

        public void setRegistrationTypeName(String registrationTypeName) {
            this.registrationTypeName = registrationTypeName;
        }

        public String getRemainingDailyAmtLimitCr() {
            return remainingDailyAmtLimitCr;
        }

        public void setRemainingDailyAmtLimitCr(String remainingDailyAmtLimitCr) {
            this.remainingDailyAmtLimitCr = remainingDailyAmtLimitCr;
        }

        public String getRemainingDailyAmtLimitDr() {
            return remainingDailyAmtLimitDr;
        }

        public void setRemainingDailyAmtLimitDr(String remainingDailyAmtLimitDr) {
            this.remainingDailyAmtLimitDr = remainingDailyAmtLimitDr;
        }

        public String getRemainingDailyTransLimitCr() {
            return remainingDailyTransLimitCr;
        }

        public void setRemainingDailyTransLimitCr(String remainingDailyTransLimitCr) {
            this.remainingDailyTransLimitCr = remainingDailyTransLimitCr;
        }

        public String getRemainingDailyTransLimitDr() {
            return remainingDailyTransLimitDr;
        }

        public void setRemainingDailyTransLimitDr(String remainingDailyTransLimitDr) {
            this.remainingDailyTransLimitDr = remainingDailyTransLimitDr;
        }

        public String getRemainingMonthlyAmtLimitCr() {
            return remainingMonthlyAmtLimitCr;
        }

        public void setRemainingMonthlyAmtLimitCr(String remainingMonthlyAmtLimitCr) {
            this.remainingMonthlyAmtLimitCr = remainingMonthlyAmtLimitCr;
        }

        public String getRemainingMonthlyAmtLimitDr() {
            return remainingMonthlyAmtLimitDr;
        }

        public void setRemainingMonthlyAmtLimitDr(String remainingMonthlyAmtLimitDr) {
            this.remainingMonthlyAmtLimitDr = remainingMonthlyAmtLimitDr;
        }

        public String getRemainingMonthlyTransLimitCr() {
            return remainingMonthlyTransLimitCr;
        }

        public void setRemainingMonthlyTransLimitCr(String remainingMonthlyTransLimitCr) {
            this.remainingMonthlyTransLimitCr = remainingMonthlyTransLimitCr;
        }

        public String getRemainingMonthlyTransLimitDr() {
            return remainingMonthlyTransLimitDr;
        }

        public void setRemainingMonthlyTransLimitDr(String remainingMonthlyTransLimitDr) {
            this.remainingMonthlyTransLimitDr = remainingMonthlyTransLimitDr;
        }

        public String getRemainingYearlyAmtLimitCr() {
            return remainingYearlyAmtLimitCr;
        }

        public void setRemainingYearlyAmtLimitCr(String remainingYearlyAmtLimitCr) {
            this.remainingYearlyAmtLimitCr = remainingYearlyAmtLimitCr;
        }

        public String getRemainingYearlyAmtLimitDr() {
            return remainingYearlyAmtLimitDr;
        }

        public void setRemainingYearlyAmtLimitDr(String remainingYearlyAmtLimitDr) {
            this.remainingYearlyAmtLimitDr = remainingYearlyAmtLimitDr;
        }

        public String getRemainingYearlyTransLimitCr() {
            return remainingYearlyTransLimitCr;
        }

        public void setRemainingYearlyTransLimitCr(String remainingYearlyTransLimitCr) {
            this.remainingYearlyTransLimitCr = remainingYearlyTransLimitCr;
        }

        public String getRemainingYearlyTransLimitDr() {
            return remainingYearlyTransLimitDr;
        }

        public void setRemainingYearlyTransLimitDr(String remainingYearlyTransLimitDr) {
            this.remainingYearlyTransLimitDr = remainingYearlyTransLimitDr;
        }

        public String getSegmentId() {
            return segmentId;
        }

        public void setSegmentId(String segmentId) {
            this.segmentId = segmentId;
        }

        public String getTotalDailyAmtLimitCr() {
            return totalDailyAmtLimitCr;
        }

        public void setTotalDailyAmtLimitCr(String totalDailyAmtLimitCr) {
            this.totalDailyAmtLimitCr = totalDailyAmtLimitCr;
        }

        public String getTotalDailyAmtLimitDr() {
            return totalDailyAmtLimitDr;
        }

        public void setTotalDailyAmtLimitDr(String totalDailyAmtLimitDr) {
            this.totalDailyAmtLimitDr = totalDailyAmtLimitDr;
        }

        public String getTotalDailyTransLimitCr() {
            return totalDailyTransLimitCr;
        }

        public void setTotalDailyTransLimitCr(String totalDailyTransLimitCr) {
            this.totalDailyTransLimitCr = totalDailyTransLimitCr;
        }

        public String getTotalDailyTransLimitDr() {
            return totalDailyTransLimitDr;
        }

        public void setTotalDailyTransLimitDr(String totalDailyTransLimitDr) {
            this.totalDailyTransLimitDr = totalDailyTransLimitDr;
        }

        public String getTotalMonthlyAmtLimitCr() {
            return totalMonthlyAmtLimitCr;
        }

        public void setTotalMonthlyAmtLimitCr(String totalMonthlyAmtLimitCr) {
            this.totalMonthlyAmtLimitCr = totalMonthlyAmtLimitCr;
        }

        public String getTotalMonthlyAmtLimitDr() {
            return totalMonthlyAmtLimitDr;
        }

        public void setTotalMonthlyAmtLimitDr(String totalMonthlyAmtLimitDr) {
            this.totalMonthlyAmtLimitDr = totalMonthlyAmtLimitDr;
        }

        public String getTotalMonthlyTransLimitCr() {
            return totalMonthlyTransLimitCr;
        }

        public void setTotalMonthlyTransLimitCr(String totalMonthlyTransLimitCr) {
            this.totalMonthlyTransLimitCr = totalMonthlyTransLimitCr;
        }

        public String getTotalMonthlyTransLimitDr() {
            return totalMonthlyTransLimitDr;
        }

        public void setTotalMonthlyTransLimitDr(String totalMonthlyTransLimitDr) {
            this.totalMonthlyTransLimitDr = totalMonthlyTransLimitDr;
        }

        public String getTotalYearlyAmtLimitCr() {
            return totalYearlyAmtLimitCr;
        }

        public void setTotalYearlyAmtLimitCr(String totalYearlyAmtLimitCr) {
            this.totalYearlyAmtLimitCr = totalYearlyAmtLimitCr;
        }

        public String getTotalYearlyAmtLimitDr() {
            return totalYearlyAmtLimitDr;
        }

        public void setTotalYearlyAmtLimitDr(String totalYearlyAmtLimitDr) {
            this.totalYearlyAmtLimitDr = totalYearlyAmtLimitDr;
        }

        public String getTotalYearlyTransLimitCr() {
            return totalYearlyTransLimitCr;
        }

        public void setTotalYearlyTransLimitCr(String totalYearlyTransLimitCr) {
            this.totalYearlyTransLimitCr = totalYearlyTransLimitCr;
        }

        public String getTotalYearlyTransLimitDr() {
            return totalYearlyTransLimitDr;
        }

        public void setTotalYearlyTransLimitDr(String totalYearlyTransLimitDr) {
            this.totalYearlyTransLimitDr = totalYearlyTransLimitDr;
        }

        public String getIsoCode() {
            return isoCode;
        }

        public void setIsoCode(String isoCode) {
            this.isoCode = isoCode;
        }


    }

}




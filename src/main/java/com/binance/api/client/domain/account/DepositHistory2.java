package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * History of account deposits.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepositHistory2 {

    private String amount;
    private String coin;
    private String network;
    private int status;
    private String address;
    private String addressTag;
    private int transferType;
    private String txId;
    private Long insertTime;
    private String confirmTimes;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressTag() {
        return addressTag;
    }

    public void setAddressTag(String addressTag) {
        this.addressTag = addressTag;
    }

    public int getTransferType() {
        return transferType;
    }

    public void setTransferType(int transferType) {
        this.transferType = transferType;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public Long getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Long insertTime) {
        this.insertTime = insertTime;
    }

    public String getConfirmTimes() {
        return confirmTimes;
    }

    public void setConfirmTimes(String confirmTimes) {
        this.confirmTimes = confirmTimes;
    }

    @Override
    public String toString() {
        return "DepositHistory2{" +
                "amount='" + amount + '\'' +
                ", coin='" + coin + '\'' +
                ", network='" + network + '\'' +
                ", status=" + status +
                ", address='" + address + '\'' +
                ", addressTag='" + addressTag + '\'' +
                ", transferType=" + transferType +
                ", txId='" + txId + '\'' +
                ", insertTime=" + insertTime +
                ", confirmTimes='" + confirmTimes + '\'' +
                '}';
    }
}

package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A withdraw that was done to a Binance account.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WithdrawHistory2 {

    /**
     * Destination address.
     */
    private String address;
    /**
     * Amount withdrawn.
     */
    private String amount;

    private String applyTime;

    /**
     * Transaction id.
     */
    private String txId;

    /**
     * Id.
     */
    private String id;

    /**
     * (0:Email Sent,1:Cancelled 2:Awaiting Approval 3:Rejected 4:Processing 5:Failure 6:Completed)
     */
    private int status;

    private String coin;
    private String withdrawOrderId;
    private String network;
    private int transferType;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

  public String getCoin() {
    return coin;
  }

  public void setCoin(String coin) {
    this.coin = coin;
  }

  public String getWithdrawOrderId() {
    return withdrawOrderId;
  }

  public void setWithdrawOrderId(String withdrawOrderId) {
    this.withdrawOrderId = withdrawOrderId;
  }

  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public int getTransferType() {
    return transferType;
  }

  public void setTransferType(int transferType) {
    this.transferType = transferType;
  }

  @Override
  public String toString() {
    return "WithdrawHistory2{" +
            "address='" + address + '\'' +
            ", amount='" + amount + '\'' +
            ", applyTime='" + applyTime + '\'' +
            ", txId='" + txId + '\'' +
            ", id='" + id + '\'' +
            ", status=" + status +
            ", coin='" + coin + '\'' +
            ", withdrawOrderId='" + withdrawOrderId + '\'' +
            ", network='" + network + '\'' +
            ", transferType=" + transferType +
            '}';
  }
}

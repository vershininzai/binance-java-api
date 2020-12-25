package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Daily Account Snapshot.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountSnapshotVoDataPosition {

  /**
   * ...
   */
  private String entryPrice;
  /**
   * ...
   */
  private String markPrice;
  /**
   * ...
   */
  private String positionAmt;
  /**
   * ...
   */
  private String symbol;
  /**
   * ...
   */
  private String unRealizedProfit;

  public String getEntryPrice() {
    return entryPrice;
  }

  public void setEntryPrice(String entryPrice) {
    this.entryPrice = entryPrice;
  }

  public String getMarkPrice() {
    return markPrice;
  }

  public void setMarkPrice(String markPrice) {
    this.markPrice = markPrice;
  }

  public String getPositionAmt() {
    return positionAmt;
  }

  public void setPositionAmt(String positionAmt) {
    this.positionAmt = positionAmt;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public String getUnRealizedProfit() {
    return unRealizedProfit;
  }

  public void setUnRealizedProfit(String unRealizedProfit) {
    this.unRealizedProfit = unRealizedProfit;
  }
}

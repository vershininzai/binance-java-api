package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Daily Account Snapshot.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountSnapshotVoData {

  /**
   * ...
   */
  private String totalAssetOfBtc;
  /**
   * ...
   */
  private String marginLevel;
  /**
   * ...
   */
  private String totalLiabilityOfBtc;
  /**
   * ...
   */
  private String totalNetAssetOfBtc;

  /**
   * ...
   */
  private List<AccountSnapshotVoDataBalances> balances;
  /**
   * ...
   */
  private List<AccountSnapshotVoDataUserAssets> userAssets;
  /**
   * ...
   */
  private List<AccountSnapshotVoDataPosition> position;

  public String getTotalAssetOfBtc() {
    return totalAssetOfBtc;
  }

  public void setTotalAssetOfBtc(String totalAssetOfBtc) {
    this.totalAssetOfBtc = totalAssetOfBtc;
  }

  public String getMarginLevel() {
    return marginLevel;
  }

  public void setMarginLevel(String marginLevel) {
    this.marginLevel = marginLevel;
  }

  public String getTotalLiabilityOfBtc() {
    return totalLiabilityOfBtc;
  }

  public void setTotalLiabilityOfBtc(String totalLiabilityOfBtc) {
    this.totalLiabilityOfBtc = totalLiabilityOfBtc;
  }

  public String getTotalNetAssetOfBtc() {
    return totalNetAssetOfBtc;
  }

  public void setTotalNetAssetOfBtc(String totalNetAssetOfBtc) {
    this.totalNetAssetOfBtc = totalNetAssetOfBtc;
  }

  public List<AccountSnapshotVoDataBalances> getBalances() {
    return balances;
  }

  public void setBalances(List<AccountSnapshotVoDataBalances> balances) {
    this.balances = balances;
  }

  public List<AccountSnapshotVoDataUserAssets> getUserAssets() {
    return userAssets;
  }

  public void setUserAssets(List<AccountSnapshotVoDataUserAssets> userAssets) {
    this.userAssets = userAssets;
  }

  public List<AccountSnapshotVoDataPosition> getPosition() {
    return position;
  }

  public void setPosition(List<AccountSnapshotVoDataPosition> position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "AccountSnapshotVoData{" +
            "totalAssetOfBtc='" + totalAssetOfBtc + '\'' +
            ", marginLevel='" + marginLevel + '\'' +
            ", totalLiabilityOfBtc='" + totalLiabilityOfBtc + '\'' +
            ", totalNetAssetOfBtc='" + totalNetAssetOfBtc + '\'' +
            ", balances=" + balances +
            ", userAssets=" + userAssets +
            ", position=" + position +
            '}';
  }
}

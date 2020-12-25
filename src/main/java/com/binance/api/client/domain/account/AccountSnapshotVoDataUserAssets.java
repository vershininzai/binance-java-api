package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Daily Account Snapshot.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountSnapshotVoDataUserAssets {

  /**
   * ...
   */
  private String asset;
  /**
   * ...
   */
  private String free;
  /**
   * ...
   */
  private String locked;
  /**
   * ...
   */
  private String borrowed;
  /**
   * ...
   */
  private String interest;
  /**
   * ...
   */
  private String netAsset;

  public String getAsset() {
    return asset;
  }

  public void setAsset(String asset) {
    this.asset = asset;
  }

  public String getFree() {
    return free;
  }

  public void setFree(String free) {
    this.free = free;
  }

  public String getLocked() {
    return locked;
  }

  public void setLocked(String locked) {
    this.locked = locked;
  }

  public String getBorrowed() {
    return borrowed;
  }

  public void setBorrowed(String borrowed) {
    this.borrowed = borrowed;
  }

  public String getInterest() {
    return interest;
  }

  public void setInterest(String interest) {
    this.interest = interest;
  }

  public String getNetAsset() {
    return netAsset;
  }

  public void setNetAsset(String netAsset) {
    this.netAsset = netAsset;
  }
}

package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Daily Account Snapshot.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountSnapshotVo {

  /**
   * ...
   */
  private String type;

  /**
   * ...
   */
  private long updateTime;

  /**
   * ...
   */
  private AccountSnapshotVoData data;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public long getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(long updateTime) {
    this.updateTime = updateTime;
  }

  public AccountSnapshotVoData getData() {
    return data;
  }

  public void setData(AccountSnapshotVoData data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "AccountSnapshotVo{" +
            "type='" + type + '\'' +
            ", updateTime=" + updateTime +
            ", data=" + data +
            '}';
  }
}

package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Account Snapshot.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountSnapshot {

  /**
   * ...
   */
  private int code;

  /**
   * ...
   */
  private String msg;

  /**
   * ...
   */
  private List<AccountSnapshotVo> snapshotVos;

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public List<AccountSnapshotVo> getSnapshotVos() {
    return snapshotVos;
  }

  public void setSnapshotVos(List<AccountSnapshotVo> snapshotVos) {
    this.snapshotVos = snapshotVos;
  }

  @Override
  public String toString() {
    return "AccountSnapshot{" +
            "code=" + code +
            ", msg='" + msg + '\'' +
            ", snapshotVos=" + snapshotVos +
            '}';
  }
}

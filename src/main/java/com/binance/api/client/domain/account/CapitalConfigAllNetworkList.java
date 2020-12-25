package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class CapitalConfigAllNetworkList {

    private String addressRegex;
    private String coin;
    private String depositDesc;
    private Boolean depositEnable;
    private Boolean isDefault;
    private String memoRegex;
    private Integer minConfirm;
    private String name;
    private String network;
    private Boolean resetAddressStatus;
    private String specialTips;
    private Integer unLockConfirm;
    private String withdrawDesc;
    private Boolean withdrawEnable;
    private String withdrawFee;
    private String withdrawMin;
}

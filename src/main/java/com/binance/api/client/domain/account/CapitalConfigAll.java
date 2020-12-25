package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class CapitalConfigAll {

    private String coin;
    private Boolean depositAllEnable;
    private String free;
    private String freeze;
    private String ipoable;
    private String ipoing;
    private Boolean isLegalMoney;
    private String locked;
    private String name;
    private List<CapitalConfigAllNetworkList> networkList;
}

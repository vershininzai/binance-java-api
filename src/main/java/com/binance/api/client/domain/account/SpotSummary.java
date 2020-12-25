package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpotSummary {

    private int totalCount;
    private String masterAccountTotalAsset;
    private List<SpotSubUserAssetBtcVo> spotSubUserAssetBtcVoList;

}

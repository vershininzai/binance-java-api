package com.binance.api.client.impl;

import com.binance.api.client.BinanceFapiRestClient;
import com.binance.api.client.domain.account.AccountInformationV2;

import static com.binance.api.client.impl.BinanceApiServiceGenerator.createFuturesService;
import static com.binance.api.client.impl.BinanceApiServiceGenerator.executeSync;

public class BinanceFapiRestClientImpl implements BinanceFapiRestClient {

    private final BinanceFapiService binanceApiService;

    public BinanceFapiRestClientImpl(String apiKey, String secret) {
        binanceApiService = createFuturesService(BinanceFapiService.class, apiKey, secret);
    }

    @Override
    public AccountInformationV2 getAccountInformationV2(Long recvWindow, Long timestamp) {
        return executeSync(binanceApiService.getAccountInformationV2(recvWindow, timestamp));
    }
}

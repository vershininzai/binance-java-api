package com.binance.api.client;

import com.binance.api.client.domain.account.AccountInformationV2;

/**
 * Binance API facade, supporting synchronous/blocking access Binance's REST API.
 */
public interface BinanceFapiRestClient {
    AccountInformationV2 getAccountInformationV2(Long recvWindow, Long timestamp);
}

package com.spacemankz.coinvalue.data.api

import com.spacemankz.coinvalue.model.cash.Cash
import com.spacemankz.coinvalue.model.cashless.Cashless
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getCashMoney(): Response<Cash>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getCashlessMoney(): Response<Cashless>

}
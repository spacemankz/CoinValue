package com.spacemankz.coinvalue.data.repository

import com.spacemankz.coinvalue.data.api.RetrofitInstance
import com.spacemankz.coinvalue.model.cash.Cash
import com.spacemankz.coinvalue.model.cashless.Cashless
import retrofit2.Response

class Repository {

    suspend fun getCash(): Response<Cash>{
        return RetrofitInstance.api.getCashMoney()
    }


    suspend fun getCashless(): Response<Cashless>{
        return RetrofitInstance.api.getCashlessMoney()
    }

}
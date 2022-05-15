package com.spacemankz.coinvalue.screens.first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.spacemankz.coinvalue.data.repository.Repository
import com.spacemankz.coinvalue.model.cash.Cash
import kotlinx.coroutines.launch
import retrofit2.Response

class FirstViewModel: ViewModel() {

    var repo = Repository()
    val cashList: MutableLiveData<Response<Cash>> = MutableLiveData()

    fun getCashMoney(){
        viewModelScope.launch {
            cashList.value = repo.getCash()
        }
    }
}
package com.example.polestudiov3.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.polestudiov3.repository.LoginRepository
import com.idax.polestudiok.Model.ModelUserInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginRepository: LoginRepository
    ):ViewModel() {
    val _modelUser = MutableLiveData<ModelUserInfo?>()

    fun getUserModel(userName:String, password:String): LiveData<ModelUserInfo?> {
        viewModelScope.launch(Dispatchers.IO) {
            val loginUser = loginRepository.getUserLogin(username= userName, password = password, "probe")

            _modelUser.postValue(loginUser)
        }
        return _modelUser
    }
}
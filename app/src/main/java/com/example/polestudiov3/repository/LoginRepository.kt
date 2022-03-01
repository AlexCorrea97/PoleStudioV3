package com.example.polestudiov3.repository

import android.widget.Toast
import com.example.polestudiov3.provider.LoginProvider
import com.idax.polestudiok.Model.GenericResponseLogin
import com.idax.polestudiok.Model.ModelUserInfo
import javax.inject.Inject

interface LoginRepository {
    suspend fun getUserLogin(username: String, password:String, token: String): ModelUserInfo?
}
class LoginRepositoryImp @Inject constructor(
    private val loginProvider: LoginProvider
): LoginRepository{
    override suspend fun getUserLogin(username: String, password: String, token:String):ModelUserInfo? {
        var loginResponse = loginProvider.getUsersLogin(
            mapOf("user_name" to username, "password" to password,"OS" to "0", "token" to token)
        ).body()
        val ah = loginResponse
        return loginResponse?.response
    }

}
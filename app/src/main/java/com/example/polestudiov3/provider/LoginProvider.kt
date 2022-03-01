package com.example.polestudiov3.provider

import com.idax.polestudiok.Model.GenericResponseLogin
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface LoginProvider {

    @Headers("Content-Type: application/json")
    @POST("Login")
    suspend fun getUsersLogin(
        //@Field("user_name") user: String,
        //@Field("password") password: String,
        @Body credentials: Map<String, String>
    ): Response<GenericResponseLogin>

}
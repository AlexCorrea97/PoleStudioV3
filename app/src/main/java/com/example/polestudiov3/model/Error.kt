package com.idax.polestudiok.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

typealias Error_ = Error
data class Error(
    val code: Int,
    val message: String,
    @SerializedName("error-message")val errorMessage: String,
) : Serializable
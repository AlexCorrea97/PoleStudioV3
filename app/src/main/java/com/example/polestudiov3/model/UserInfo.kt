package com.idax.polestudiok.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.sql.Date

data class UserInfo(
    @SerializedName("expiration_day") val expirationDate: Date,
    @SerializedName("remaining_classes") val remainingClass: Int,
    @SerializedName("total_classes") val totalClass: Int
) : Serializable {
}
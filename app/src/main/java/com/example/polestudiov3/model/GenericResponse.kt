package com.idax.polestudiok.Model

import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName
import com.idax.polestudiok.Model.Calendar.Calendar
import com.idax.polestudiok.Model.Calendar.Session
import com.idax.polestudiok.Model.View.Discipline
import com.idax.polestudiok.Model.View.ModelPulledApart
import java.io.Serializable

data class GenericResponse(
    @SerializedName("status-code") val statusCode: Int,
    @SerializedName("rows") val rows: Int,
    @SerializedName("error") val error: Error,
    @SerializedName("response") val response: JsonObject?,
) : Serializable
data class GenericResponseNotification(
    @SerializedName("status-code") val statusCode: Int,
    @SerializedName("rows") val rows: Int,
    @SerializedName("error") val error: Error,
    @SerializedName("response") val response: String
) : Serializable
data class GenericResponseLogin(
    @SerializedName("status-code") val statusCode: Int,
    @SerializedName("rows") val rows: Int,
    @SerializedName("error") val error: Error?,
    @SerializedName("response") val response: ModelUserInfo?,
) : Serializable

data class GenericResponseCalendar(
    @SerializedName("status-code") val statusCode: Int,
    @SerializedName("rows") val rows: Int,
    @SerializedName("error") val error: Error,
    @SerializedName("response") val response: Calendar,
) : Serializable

data class GenericResponseNewSession(
    @SerializedName("status-code") val statusCode: Int,
    @SerializedName("rows") val rows: Int,
    @SerializedName("error") val error: Error,
    @SerializedName("response") val response: MutableList<MutableList<MutableList<Session>>>,
) : Serializable

data class GenericResponsePulledApart(
    @SerializedName("status-code") val statusCode: Int,
    @SerializedName("rows") val rows: Int,
    @SerializedName("error") val error: Error,
    @SerializedName("response") val response: ModelPulledApart?,
) : Serializable

data class GenericResponseUsers(
    @SerializedName("status-code") val statusCode: Int,
    @SerializedName("rows") val rows: Int,
    @SerializedName("error") val error: Error,
    @SerializedName("response") val response: MutableList<User>
) : Serializable
data class GenericResponseSettings(
    @SerializedName("status-code") val statusCode: Int,
    @SerializedName("rows") val rows: Int,
    @SerializedName("error") val error: Error,
    @SerializedName("response") val response: MutableList<Settings>
) : Serializable

data class GenericResponseModelUser(
    @SerializedName("status-code") val statusCode: Int,
    @SerializedName("rows") val rows: Int,
    @SerializedName("error") val error: Error,
    @SerializedName("response") val response: ModelUserInfo
) : Serializable

data class GenericResponseNewUser(
    @SerializedName("status-code") val statusCode: Int,
    @SerializedName("rows") val rows: Int,
    @SerializedName("error") val error: Error,
    @SerializedName("response") val response: MutableList<User>?
) : Serializable

data class GenericResponseTrainerList(
    @SerializedName("status-code") val statusCode: Int,
    @SerializedName("rows") val rows: Int,
    @SerializedName("error") val error: Error,
    @SerializedName("response") val response: MutableList<Trainer>
) : Serializable

data class GenericResponseDisciplines(
    @SerializedName("status-code") val statusCode: Int,
    @SerializedName("rows") val rows: Int,
    @SerializedName("error") val error: Error,
    @SerializedName("response") val response: MutableList<Discipline>
) : Serializable
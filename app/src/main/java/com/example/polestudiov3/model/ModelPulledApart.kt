package com.idax.polestudiok.Model.View

import com.google.gson.annotations.SerializedName
import com.idax.polestudiok.Model.Calendar.Session
import com.idax.polestudiok.Model.UserInfo
import java.io.Serializable

data class ModelPulledApart(
    @SerializedName("user_info")var userInfo: UserInfo,
    @SerializedName("aparted")var apartedSessions: MutableList<Session>?,
    @SerializedName("sessions")var sessionmnList: MutableList<MutableList<MutableList<Session>?>>?
): Serializable {

}
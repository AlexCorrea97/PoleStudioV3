package com.idax.polestudiok.Model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.idax.polestudiok.Model.Calendar.Session
import com.idax.polestudiok.Model.View.Discipline
import java.io.Serializable

data class ModelUserInfo(
    @SerializedName("user") val user: User?,
    @SerializedName("user_info") var userInfo: UserInfo?,
    @SerializedName("disciplines") var disciplineList: MutableList<Discipline>?,
    @SerializedName("trainers") var trainerList: MutableList<Trainer>?,
    @SerializedName("aparted") var apartedSession: MutableList<Session>?,
    @SerializedName("sessions") var sessionsList: MutableList<MutableList<MutableList<Session>?>>?
) : Serializable, Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readParcelable(User::class.java.classLoader),
        TODO("userInfo"),
        TODO("disciplineList"),
        TODO("trainerList"),
        TODO("apartedSession"),
        TODO("sessionsList")
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeParcelable(user, flags)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ModelUserInfo> {
        override fun createFromParcel(parcel: Parcel): ModelUserInfo {
            return ModelUserInfo(parcel)
        }

        override fun newArray(size: Int): Array<ModelUserInfo?> {
            return arrayOfNulls(size)
        }
    }
}

data class SessionList(
    @SerializedName("1") val sessionList: List<List<Session>?>
) : Serializable


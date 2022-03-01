package com.idax.polestudiok.Model.Calendar

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.idax.polestudiok.Model.View.Discipline
import java.io.Serializable
import java.util.*

data class Calendar(
    @SerializedName("sessions")val sessions: MutableList<MutableList<MutableList<Session>>>?,
    @SerializedName("disciplines")val disciplines: MutableList<Discipline>
    ):Serializable

data class Session(
    @SerializedName("session_id") val sessionId: Int,//
    @SerializedName("day") val dayWeek: Int,//0-lun : 5-sab
    @SerializedName("hour_text") var hourClass: String,
    @SerializedName("discipline_id") val disciplineId: Int,
    @SerializedName("branch_id") val branchId: Int,
    @SerializedName("session_time") val sessionTime: Date,//date
    @SerializedName("remaining") var remaining: Int,
    @SerializedName("branch") val branch: String,
    @SerializedName("trainer") val trainer: String,
    @SerializedName("name") val disciplineName: String,
    @SerializedName("total") var total:Int,
    @SerializedName("enrolled") var enrolled:Int,
    @SerializedName("color") val color: String,
    var sessionPosition:Int
):Serializable, Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        TODO("sessionTime"),
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(sessionId)
        parcel.writeInt(dayWeek)
        parcel.writeString(hourClass)
        parcel.writeInt(disciplineId)
        parcel.writeInt(branchId)
        parcel.writeInt(remaining)
        parcel.writeString(branch)
        parcel.writeString(trainer)
        parcel.writeString(disciplineName)
        parcel.writeInt(total)
        parcel.writeInt(enrolled)
        parcel.writeString(color)
        parcel.writeInt(sessionPosition)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Session> {
        override fun createFromParcel(parcel: Parcel): Session {
            return Session(parcel)
        }

        override fun newArray(size: Int): Array<Session?> {
            return arrayOfNulls(size)
        }
    }
}


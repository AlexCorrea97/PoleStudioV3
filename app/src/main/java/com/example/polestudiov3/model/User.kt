package com.idax.polestudiok.Model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class User(
    @SerializedName("id")val id: Int,
    @SerializedName("name")val name: String,
    @SerializedName("last_name")val lastName: String,
    @SerializedName("user_type")val userType: Int,
    @SerializedName("user_name")val userName: String,
    @SerializedName("password")val password: String,
    @SerializedName("state")val state: Int,
) : Serializable, Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeString(lastName)
        parcel.writeInt(userType)
        parcel.writeString(userName)
        parcel.writeString(password)
        parcel.writeInt(state)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}

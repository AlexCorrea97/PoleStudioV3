package com.idax.polestudiok.Model

import android.os.Parcel
import android.os.Parcelable

data class Trainer(
    val id: Int,
    val name: String
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Trainer> {
        override fun createFromParcel(parcel: Parcel): Trainer {
            return Trainer(parcel)
        }

        override fun newArray(size: Int): Array<Trainer?> {
            return arrayOfNulls(size)
        }
    }
}
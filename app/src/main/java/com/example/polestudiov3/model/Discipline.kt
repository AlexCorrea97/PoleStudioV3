package com.idax.polestudiok.Model.View

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Discipline(
    @SerializedName("id") val id: Int,
    @SerializedName("name") var name: String?,
    @SerializedName("color") var color: String?,
    var isChecked: Boolean = false
) : Serializable, Parcelable, Cloneable {

    public override fun clone(): Discipline {
        return Discipline(id, name, color, isChecked)
    }

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeString(color)
        parcel.writeByte(if (isChecked) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Discipline> {
        override fun createFromParcel(parcel: Parcel): Discipline {
            return Discipline(parcel)
        }

        override fun newArray(size: Int): Array<Discipline?> {
            return arrayOfNulls(size)
        }
    }
}
package com.idax.polestudiok.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Settings(
    @SerializedName("branch_id")val branchId:Int,
    @SerializedName("time_before_apart")val timeBefore:String,
    @SerializedName("time_before_cancel")val timeCancel:String
): Serializable
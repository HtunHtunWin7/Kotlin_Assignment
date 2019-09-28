package com.greenovator.kotlin_assignment.data.vos

import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

class Genre(
    @SerializedName("id")
    @ColumnInfo(name = "id")
    val id: Int,
    @SerializedName("name")
    @ColumnInfo(name = "name")
    val name: String
)

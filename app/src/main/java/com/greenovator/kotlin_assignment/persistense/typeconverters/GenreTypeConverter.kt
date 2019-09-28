package com.greenovator.kotlin_assignment.persistense.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.greenovator.kotlin_assignment.data.vos.Genre

class GenreTypeConverter {
    @TypeConverter
    fun toString(list: List<Genre>):String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun toList(json: String):List<Genre>{
        val typeToken =object : TypeToken<List<Genre>>(){
        }.type
        return Gson().fromJson(json,typeToken)
    }
}
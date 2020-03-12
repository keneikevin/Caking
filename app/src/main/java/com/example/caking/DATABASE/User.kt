package com.example.caking.DATABASE

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User (
    @PrimaryKey(autoGenerate = true)
    var userInt: Int,
    @ColumnInfo(name = "name")
    val name:String,
    @ColumnInfo(name="email")
    val email:String,
    @ColumnInfo(name="phone")
    val phone:Int,
    @ColumnInfo(name="password")
    val password:String
)
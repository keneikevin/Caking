package com.example.caking.DATABASE

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface UserDao {
    @Insert
    fun insert(user: User)
    @Update
    fun update(user:User)
    @Query("SELECT * from users where userInt =:key")
    fun get(key: Long):User
    @Query("SELECT * FROM users ORDER BY userInt")
    fun getAllUsers():LiveData<List<User>>
}
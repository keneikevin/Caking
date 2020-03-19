package com.example.caking

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.caking.DATABASE.UserDao
import javax.sql.DataSource

class RegisterViewModelFactory(
    private val dataSource: UserDao,
    private val application: Application):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RegisterViewModel::class.java)){
            return RegisterViewModel(dataSource,application)as T
    }
    throw IllegalArgumentException("Unknown ViewModel class")
    }

}
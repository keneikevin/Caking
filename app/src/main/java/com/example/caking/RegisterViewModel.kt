package com.example.caking

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.caking.DATABASE.User
import com.example.caking.DATABASE.UserDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

class RegisterViewModel(
    val database: UserDao,
    application: Application):AndroidViewModel(application) {

    private var viewModelJob = Job()
    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }
    private val uiScope = CoroutineScope(Dispatchers.Main +  viewModelJob)
    private var use= MutableLiveData<User?>()
    private val user=database.getAllUsers()

}
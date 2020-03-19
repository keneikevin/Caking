package com.example.caking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.caking.DATABASE.UserDatabase
import com.example.caking.databinding.FragmentRegisterBinding

/**
 * A simple [Fragment] subclass.
 */
class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentRegisterBinding>(inflater,
            R.layout.fragment_register,container,false)
        val application= requireNotNull(this.activity).application
        val dataSource= UserDatabase.getInstance(application).userDao
        val viewModelFactory =RegisterViewModelFactory(dataSource,application)
        val registerViewModel =ViewModelProvider(this).get(RegisterViewModel::class.java)
        binding.registerViewmodel=registerViewModel
        binding.setLifecycleOwner(this)
        return binding.root
    }

}

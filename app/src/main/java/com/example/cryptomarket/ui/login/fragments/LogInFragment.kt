package com.example.cryptomarket.ui.login.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cryptomarket.databinding.FragmentLoginBinding
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LogInFragment: Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btSignUpEmail.setOnClickListener {
            val directions = LogInFragmentDirections.actionLogInFragmentToMainMenuActivity()
            findNavController().navigate(directions)
        }
    }
}
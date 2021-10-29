package com.example.cryptomarket.ui.login.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cryptomarket.databinding.FragmentLoginBinding
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth

class LogInFragment: Fragment() {
    private lateinit var binding: FragmentLoginBinding
    lateinit var firebaseAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        firebaseAuth = FirebaseAuth.getInstance()
        if(FirebaseAuth.getInstance().currentUser != null){
            Log.v("TAG", "curentUserUid: ${FirebaseAuth.getInstance().currentUser?.uid}")
            val directions = LogInFragmentDirections.actionLogInFragmentToMainMenuActivity()
            findNavController().navigate(directions)
        } else {
            binding.btSignUpEmail.setOnClickListener {
                anonymousAuth()
            }
        }
    }

    private fun anonymousAuth(){
        firebaseAuth.signInAnonymously()
            .addOnSuccessListener {
                val directions = LogInFragmentDirections.actionLogInFragmentToMainMenuActivity()
                findNavController().navigate(directions)
                Log.d("TAG", "curentUserUid: ${FirebaseAuth.getInstance().currentUser?.uid}")
            }
            .addOnFailureListener {
                Log.d("TAG", "anonymousAuth: $it")
            }
    }
}
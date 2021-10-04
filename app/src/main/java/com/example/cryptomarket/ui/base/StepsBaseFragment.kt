package com.example.cryptomarket.ui.base

import androidx.fragment.app.Fragment

class StepsBaseFragment: Fragment() {
    var onSuccessCallback:(() -> Unit)? = null
    var onErrorCallback:((error: String) -> Unit)? = null

    fun setOnSuccessListener(callback: (() -> Unit)){
        onSuccessCallback = callback
    }

    fun setOnErrorListener(callback: ((error: String) -> Unit)){
        onErrorCallback = callback
    }
}
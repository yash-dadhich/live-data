package com.example.livedataapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var mutableLiveData =  MutableLiveData("This is a string")

    fun updateQuote(){
        mutableLiveData.value = "When you believe it you will see it."
    }
}
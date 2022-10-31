package com.ebookfrenzy.lifecycledemo.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var list : MutableLiveData<String> = MutableLiveData()

    fun addName(value: String){
        this.list.value = list.toString() + value + "\n"
    }

    fun getPool(): MutableLiveData<String> {
        return list
    }
}
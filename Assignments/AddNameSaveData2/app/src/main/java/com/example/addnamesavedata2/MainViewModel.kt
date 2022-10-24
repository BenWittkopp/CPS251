package com.example.addnamesavedata2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    //private var namepool = ""
    private var namepool : MutableLiveData<String> = MutableLiveData()

    fun addName(value: String){
        this.namepool.value = namepool.toString() + value + "\n"
    }

    fun getPool(): MutableLiveData<String> {
        return namepool
    }
}
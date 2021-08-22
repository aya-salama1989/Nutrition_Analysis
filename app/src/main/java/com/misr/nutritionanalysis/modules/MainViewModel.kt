package com.misr.nutritionanalysis.modules

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(): ViewModel() {


    fun rightinLogs(){
        Log.e("TAG", "Testing Injection")
    }
}
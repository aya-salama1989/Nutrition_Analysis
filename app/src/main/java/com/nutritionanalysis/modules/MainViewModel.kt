package com.nutritionanalysis.modules

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(): ViewModel() {
    fun rightingLogs(){
        Log.e("TAG", "Testing Injection")
    }
}
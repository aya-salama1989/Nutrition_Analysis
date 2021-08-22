package com.misr.nutritionanalysis.modules

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.misr.nutritionanalysis.R
import com.misr.nutritionanalysis.core.BaseViewModelProvider
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


//    override fun onBackPressed() {
//        super.onBackPressed()
//
//        findNavController(R.id.nav).
//    }

}
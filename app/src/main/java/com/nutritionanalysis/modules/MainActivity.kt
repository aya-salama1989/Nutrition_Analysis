package com.nutritionanalysis.modules

import android.os.Bundle
import com.nutritionanalysis.R
import dagger.android.support.DaggerAppCompatActivity

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
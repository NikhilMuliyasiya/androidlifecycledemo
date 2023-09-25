package com.savvytech.tabapicalldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

class SecondActivity : AppCompatActivity() {

    val formatter = SimpleDateFormat("HH:mm:ss.SS")
    val date = Date()
    val current = formatter.format(date)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.e("activity2", "onCreate $current");
    }

    init {
        Log.e("activity2", "init $current");
    }

    override fun onStart() {
        super.onStart()
        Log.e("activity2", "onStart $current");
    }

    override fun onResume() {
        super.onResume()
        Log.e("activity2", "onResume $current")

    }

    override fun onPause() {
        super.onPause()
        Log.e("activity2", "onPause $current");

    }

    override fun onStop() {
        super.onStop()
        Log.e("activity2", "onStop $current");

    }

    override fun recreate() {
        super.recreate()
        Log.e("activity2", "recreate $current");
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("activity2", "onRestart $current");
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.e("activity2", "onDestroy $current");

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("activity2", "Muliyasiya")
        Log.e("activity2", "onSaveInstanceState Bundle send ${outState.getString("activity2")} $current");
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("activity2", "onRestoreInstanceState Bundle receive ${savedInstanceState.getString("activity2")} $current");
    }
}
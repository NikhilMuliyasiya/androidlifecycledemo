package com.savvytech.tabapicalldemo

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.savvytech.tabapicalldemo.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    val formatter = SimpleDateFormat("HH:mm:ss.SS")
    val date = Date()
    val current = formatter.format(date)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        Log.e("activity1", "onCreate $current");


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = MyViewPagerAdapter(this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = "Tab ${(position + 1)}"
        }.attach()
    }

    init {
        Log.e("activity1", "init $current");
    }


    override fun onStart() {
        super.onStart()
        Log.e("activity1", "onStart $current");
    }

    override fun onResume() {
        super.onResume()
        Log.e("activity1", "onResume $current")

    }

    override fun onPause() {
        super.onPause()
        Log.e("activity1", "onPause $current");

    }

    override fun onStop() {
        super.onStop()
        Log.e("activity1", "onStop $current");

    }

    override fun recreate() {
        super.recreate()
        Log.e("activity1", "recreate $current");
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("activity1", "onRestart $current");
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.e("activity1", "onDestroy $current");

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("activity1", "Nikhil")
        Log.e("activity1", "onSaveInstanceState Bundle send ${outState.getString("activity1")} $current");
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("activity1", "onRestoreInstanceState Bundle receive ${savedInstanceState.getString("activity1")} $current");
    }
}
package com.mey.includelayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mey.includelayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        HeaderHelper.customHeader(
            binding.customHeader,
            title = "Test",
            startIconVisibility = true,
            endIconVisibility = true,
            startIcon = R.drawable.ic_baseline_arrow_back_24,
            endIcon = R.drawable.ic_baseline_favorite_24,
            startIconClick = {
                test1()
            },
            endIconClick = {
                test2()
            },
        )




    }

    fun test1() {
        println("test1")
    }

    fun test2() {
        println("test2")
    }
}
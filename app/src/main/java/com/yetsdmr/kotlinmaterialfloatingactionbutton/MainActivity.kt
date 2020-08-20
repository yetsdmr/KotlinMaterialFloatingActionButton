package com.yetsdmr.kotlinmaterialfloatingactionbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun floatingActionButtonClicked(view : View){
        //intent ile fragment ekle sayfa değiştirebilirsin :)
        changedText.text = "Floating Action Button Clicked"
    }

    fun homePageClicked(view: View){
        //intent ile fragment ekle sayfa değiştirebilirsin :)
        changedText.text = "HomePage Clicked"

        homePageSelectedView.visibility = View.VISIBLE
        profileSelectedView.visibility = View.GONE


    }

    fun profilePageClicked(view : View){
        //intent ile activity ekle sayfa değiştirebilirsin :)
        changedText.text = "Profile Page Clicked"

        profileSelectedView.visibility = View.VISIBLE
        homePageSelectedView.visibility = View.GONE
    }
}
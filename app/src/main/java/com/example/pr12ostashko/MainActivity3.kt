package com.example.pr12ostashko

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    fun onClickPerehod4(view: View){
        val intent = Intent(this,MainActivity4::class.java)
        startActivity(intent)
    }
}
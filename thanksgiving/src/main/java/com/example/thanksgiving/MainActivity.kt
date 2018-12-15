package com.example.thanksgiving

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.base.Greeting
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_greeting.text = Greeting.thanksgivingGreeting
    }
}

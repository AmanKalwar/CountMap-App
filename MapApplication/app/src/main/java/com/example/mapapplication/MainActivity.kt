package com.example.mapapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    var clickCountMap = mutableMapOf<String, Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickDisplayView = findViewById<TextView>(R.id.clickView)

        val clickButtonView = findViewById<TextView>(R.id.clickButton)

        val userNameTextInputView = findViewById<TextInputLayout>(R.id.nameText)

        clickButtonView.setOnClickListener {
            val userName = userNameTextInputView.editText?.text?.toString()
            val maskedUserName =
                if (userName.isNullOrEmpty()) "Somebody"
                else userName

            val oldClickCount = clickCountMap[maskedUserName] ?: 0
            val newClickCount = oldClickCount + 1

            clickCountMap[maskedUserName] = newClickCount

            clickDisplayView.text = "$maskedUserName clicked $newClickCount times"

        }
    }
}
















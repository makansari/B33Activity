package com.example.b33activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClcik.setOnClickListener {
            var username = editTextUsername.text.toString()
            Toast.makeText(this, "$username",Toast.LENGTH_LONG).show()
            textViewUsername.setText(username)

        }
    }
}
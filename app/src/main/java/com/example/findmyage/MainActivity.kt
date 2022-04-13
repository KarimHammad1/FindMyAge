package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
     lateinit var yearOfBirth:EditText
     lateinit var result:TextView
     lateinit var getAge:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        yearOfBirth=findViewById(R.id.etUserAge)
        result=findViewById(R.id.tvShowAge)
        getAge=findViewById(R.id.buGetAge)


    }

    fun getAge(view: View) {
        var year: Int = yearOfBirth.text.toString().toInt()
        var currentYear = Calendar.getInstance().get(Calendar.YEAR)
        var age: Int = currentYear - year
        result.text="Your age is $age years"
    }

}
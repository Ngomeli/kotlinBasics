package com.example.variables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.example.variables.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)//initializaton
        val view= binding.root
        setContentView(view)//determines what is displayed in your activity
        binding.login.setOnClickListener {


        val num1: Int =90
        val num2: Int = 100
        val answer: Int = num1 + num2
Log.i("Answer","The Answer is $answer")
        val toast: Toast
        toast= Toast.makeText(this, "The answer is $answer ", Toast.LENGTH_LONG)
        toast.show()
        }
    }
}
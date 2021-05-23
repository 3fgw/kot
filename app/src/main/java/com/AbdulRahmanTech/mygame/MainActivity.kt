package com.AbdulRahmanTech.mygame

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.databinding.DataBindingUtil
import com.AbdulRahmanTech.mygame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

private var score: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main)
        binding.textVieww.text = getString(R.string.textView, 0)

        binding.buttonn.setOnClickListener {
            inScore()
        }
    }
   private fun inScore(){

        score ++
        binding.textVieww.text = getString(R.string.textView, score.toString())
    }
}
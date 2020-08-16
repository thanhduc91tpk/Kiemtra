package com.thanhduc91tpk.kiemtra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result2.*

class ResultActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)

        val intent = intent
        val ten : String = intent.getStringExtra("ten")
        val tuoi : String = intent.getStringExtra("tuoi")

        txtTen.setText("ten")
        txtTuoi.setText(tuoi+" tuoi")
    }
}
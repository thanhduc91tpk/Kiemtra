package com.thanhduc91tpk.kiemtra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thanhduc91tpk.kiemtra.model.MyGirl
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var girlList : ArrayList<MyGirl>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        girlList = arrayListOf()

        addData()

        btnChon.setOnClickListener {
            val random = Random().nextInt(5)

            var myGirl  = girlList[0]

            val intent = Intent(this,ResultActivity2::class.java)
//            intent.putExtra("ten",myGirl.getTen())
//            intent.putExtra("tuoi",myGirl.getTuoi().toString())
            intent.putExtra("ten","thanh duc")
            intent.putExtra("tuoi","21")
            startActivity(intent)
        }

        btnNhapLai.setOnClickListener {
            addData()
        }

        btnThoat.setOnClickListener {
            finish()
        }
    }

    private fun addData(){
        if(txtTen1!=null && edtTuoi1 !=null){
            var myGirl : MyGirl = MyGirl(txtTen1!!.text.toString(),edtTuoi1!!.text.toString().toInt());
            girlList.add(myGirl)
        }

//        if(txtTen2!=null && edtTuoi2 !=null){
//            var myGirl = MyGirl(txtTen2.text.toString(),edtTuoi2.text.toString().toInt());
//            girlList.add(myGirl)
//        }
//
//
//        if(txtTen3!=null && edtTuoi3 !=null){
//            var myGirl = MyGirl(txtTen3.text.toString(),edtTuoi3.text.toString().toInt());
//            girlList.add(myGirl)
//        }
//
//
//        if(txtTen4!=null && edtTuoi4 !=null){
//            var myGirl = MyGirl(txtTen5.text.toString(),edtTuoi5.text.toString().toInt());
//            girlList.add(myGirl)
//        }
//
//
//        if(txtTen5!=null && edtTuoi5 !=null){
//            var myGirl = MyGirl(txtTen5.text.toString(),edtTuoi5.text.toString().toInt());
//            girlList.add(myGirl)
//        }
    }
}
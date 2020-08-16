package com.thanhduc91tpk.kiemtra.model

class MyGirl {
    private var ten : String = ""
    private var tuoi : Int = 0

    constructor(ten: String, tuoi: Int) {
        this.ten = ten
        this.tuoi = tuoi
    }


    fun getTen(): String {
        return ten
    }

    fun setTen(ten: String) {
        this.ten = ten
    }

    fun getTuoi(): Int {
        return tuoi
    }

    fun setTuoi(tuoi: Int) {
        this.tuoi = tuoi
    }
}
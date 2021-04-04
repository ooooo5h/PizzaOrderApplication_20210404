package com.neppplus.pizzaorderapplication_20210404

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setUpEvents()
    abstract fun setValues()
}
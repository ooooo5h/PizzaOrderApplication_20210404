package com.neppplus.pizzaorderapplication_20210404

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.pizzaorderapplication_20210404.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
//    test

    lateinit var mViewPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
        setUpEvents()
        setValues()
    }

    override fun setUpEvents() {

    }

    override fun setValues() {

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mViewPagerAdapter

        mainTabLayout.setupWithViewPager(mainViewPager)

    }


}
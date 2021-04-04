package com.neppplus.pizzaorderapplication_20210404

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.pizzaorderapplication_20210404.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() { // BaseActivity 상속받고, alt + Enter로 구현

    lateinit var mViewPagerAdapter : MainViewPagerAdapter // 뷰페이저어댑터에는 나중에 메인뷰페이저어댑터가 들어갈꺼야

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
        setUpEvents()
        setValues()
    }

    override fun setUpEvents() {

    }

    override fun setValues() {

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager) // 기본생성자가 아니라 커스터마이징으로 프래그먼트 매니저했으니 그 변수를 넣어줘야함..??
        mainViewPager.adapter = mViewPagerAdapter // xml에 있는 뷰페이저의 어댑터에 멤버변수어댑터를 대입해줘

        mainTabLayout.setupWithViewPager(mainViewPager)

    }


}
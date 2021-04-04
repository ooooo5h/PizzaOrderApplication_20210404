package com.neppplus.pizzaorderapplication_20210404.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.pizzaorderapplication_20210404.fragments.MyProfileFragment
import com.neppplus.pizzaorderapplication_20210404.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) { // 어댑터들을 관리해주는 폴더 생성 후 페이지어댑터 기본상속 후 생성자 fm 커스터마이팅했음. 그다음 필수 오버라이딩 함수 2개 불러내기
    override fun getItem(position: Int): Fragment { // 2. 각 페이지에 맞게 표현해야하니까 리턴 웬 함수 사용

        return when (position) {
            0 -> PizzaStoreListFragment()
            else -> MyProfileFragment()
        }

    }

    override fun getCount(): Int { // 1. 몇장짜리인지 return 해주기
        return 2
    }


    override fun getPageTitle(position: Int): CharSequence? {

        return when(position) {
            0 -> "피자 주문"
            else -> "내 정보 설정"
        }
    }
}
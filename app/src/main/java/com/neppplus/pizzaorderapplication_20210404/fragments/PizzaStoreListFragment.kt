package com.neppplus.pizzaorderapplication_20210404.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.pizzaorderapplication_20210404.R
import com.neppplus.pizzaorderapplication_20210404.ViewStoreDetailActivity
import com.neppplus.pizzaorderapplication_20210404.adapters.StoreAdapter
import com.neppplus.pizzaorderapplication_20210404.datas.Store
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*

class PizzaStoreListFragment : Fragment() { // fragments 별도 패키지 만들고, ~Fragment 로 클래스 생성 후 Fragment()상속받게 하자 android x가 주는 걸로 선택

    val mPizzaStoreList = ArrayList<Store>()
    lateinit var mPizzaStoreAdapter : StoreAdapter

    override fun onCreateView( // 어떤 xml 모양으로 쓸 건지 onCreateView 오버라이딩해서 불러주자
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list, container, false) // 어떤 xml이냐면 fragment_pizza_store_list
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) { //프래그먼트에서의 동작 관련된 코드들은 onActivityCreated 함수 오버라이딩해서 기록
        super.onActivityCreated(savedInstanceState)

        mPizzaStoreList.add(Store("피자헛", "https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg", "1588-5588"))
        mPizzaStoreList.add(Store("파파존스", "http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800", "1577-8080"))
        mPizzaStoreList.add(Store("미스터피자", "https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200", "1577-0077"))
        mPizzaStoreList.add(Store("도미노피자", "https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png", "1577-3082"))

        mPizzaStoreAdapter = StoreAdapter(activity!!, R.layout.store_list_item, mPizzaStoreList)
        pizzaStoreListView.adapter = mPizzaStoreAdapter

        pizzaStoreListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedStore = mPizzaStoreList[position]

            val myIntent = Intent(activity, ViewStoreDetailActivity::class.java)
            myIntent.putExtra("store", clickedStore)
            startActivity(myIntent)


        }

    }
}
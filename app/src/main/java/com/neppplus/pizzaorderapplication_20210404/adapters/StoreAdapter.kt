package com.neppplus.pizzaorderapplication_20210404.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.neppplus.pizzaorderapplication_20210404.R
import com.neppplus.pizzaorderapplication_20210404.datas.Store


class StoreAdapter( // 피자가게 정보들을 뿌려주는 어댑터를 만들었고, araayadapter상속받아 가게정보 뿌려줄거니 적어주고, 왼쪽에 기본생성자들 적어두기 (피자스토어 어댑터를 객체화 해줬음! 다른 코틀린파일에서 끌어다쓸쑤있게)
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Store> ) : ArrayAdapter<Store>(mContext, resId, mList) {

    val inflater = LayoutInflater.from(mContext) // 한칸의 xml를 코틀린에서 다룰수 있게(객체화) 도와주는 멤버변수를 생성한 과정

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View { // xml + 데이터변수를 조합해서 리스트뷰 위치에 맞게 뿌려주는 getView함수 오버라이딩
        var tempRow = convertView // convertVeiw가 비어있다면 새로 xml을 꺼내서 채워줘라
        if(tempRow == null) {

            tempRow = inflater.inflate(R.layout.store_list_item, null) // 스토어리스트아이템을 불러올꺼야
        }

        val row = tempRow!! //채워줬으니 빈칸일리없어

        val storeData = mList[position]

        val logoImg = row.findViewById<ImageView>(R.id.logoImg)
        val storeNameTxt = row.findViewById<TextView>(R.id.storeNameTxt)

        storeNameTxt.text = storeData.name

        Glide.with(mContext).load(storeData.logoUrl).into(logoImg)

        return row  // row가 화면에 나가자
    }
}
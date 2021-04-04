package com.neppplus.pizzaorderapplication_20210404

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() { // 화면 등장하지 않는 추상화작업을 해준 BaseActivity

    val mContext = this //코드가 복잡해지면 this를 고민해서 넣어줘야하는데, 그걸 미리 차단! 모든 this자리는 mContext

    abstract fun setUpEvents() //이벤트 처리 관련 코드들을 모아두는 함수
    abstract fun setValues() //화면에 값을 (or UI를) 띄워주기 위한 코드를 모아두는 함수

}
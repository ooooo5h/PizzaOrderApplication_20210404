package com.neppplus.pizzaorderapplication_20210404.datas

import android.net.Uri
import java.io.Serializable

class Store( // 뿌려질 정보들을 datas 폴더에 만들어서 생성자 커스터마이징해줬음 - Serializable은 나중에
    val name : String,
    val logoUrl : String,
    val phoneNum : String) : Serializable {
}
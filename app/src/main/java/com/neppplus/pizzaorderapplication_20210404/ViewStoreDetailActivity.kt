package com.neppplus.pizzaorderapplication_20210404

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.neppplus.pizzaorderapplication_20210404.datas.Store
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : BaseActivity() {

    lateinit var mStore : Store

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_view_store_detail)
        setUpEvents()
        setValues()
}

    override fun setUpEvents() {

    }

    override fun setValues() {

        mStore = intent.getSerializableExtra("store") as Store

        Glide.with(mContext).load(mStore.logoUrl).into(logoImg)
        storeNameTxt.text = mStore.name
        phoneNumTxt.text = mStore.phoneNum

    }


}
package com.neppplus.pizzaorderapplication_20210404

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
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

        callBtn.setOnClickListener {
            val pl = object : PermissionListener{
                override fun onPermissionGranted() {

                    val myUri = Uri.parse("tel:${mStore.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)

                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(mContext, "연결이 거부되었습니다", Toast.LENGTH_SHORT).show()
                }

            }
            TedPermission.with(mContext)
                .setPermissionListener(pl)
                .setDeniedMessage("[설정]에서 [전화권한]을 허용해주세요.")
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()

        }

    }

    override fun setValues() {

        mStore = intent.getSerializableExtra("store") as Store

        Glide.with(mContext).load(mStore.logoUrl).into(logoImg)
        storeNameTxt.text = mStore.name
        phoneNumTxt.text = mStore.phoneNum

    }


}
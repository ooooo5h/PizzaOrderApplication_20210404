package com.neppplus.pizzaorderapplication_20210404.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.neppplus.pizzaorderapplication_20210404.EditNicknameActivity
import com.neppplus.pizzaorderapplication_20210404.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : Fragment() { // fragment xml + 코틀린파일 복붙해줬음

    val REQ_FOR_NICKNAME = 1004

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false) // 프래그먼트이름 바꿔줬음 피자스토어말고
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        editNicknameBtn.setOnClickListener {

            val myIntent = Intent(activity, EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQ_FOR_NICKNAME) {

            if (resultCode == Activity.RESULT_OK){

                val newNickname = data?.getStringExtra("nick")

                nicknameTxt.text = newNickname
            }
        }
    }
}
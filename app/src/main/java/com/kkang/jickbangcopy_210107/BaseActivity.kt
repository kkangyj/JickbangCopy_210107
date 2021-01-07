package com.kkang.jickbangcopy_210107

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {


    //    어느 화면인지 알려줄때 쓰는 용도 변수 -> mContext
    val mContext = this

    //    이벤트 처리 코드
    abstract fun setupEvents()

    //    화면에 데이터를 뿌리는데 관련된 코드
    abstract fun setValues()


}
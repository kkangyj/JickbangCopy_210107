package com.kkang.jickbangcopy_210107

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kkang.jickbangcopy_210107.data.Room

class MainActivity : BaseActivity() {

    val mRoomList = ArrayList<Room>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mRoomList.add(Room(800000000, "서울시 방배동", 4, "서울시 방배동 4층 집입니다."))
        mRoomList.add(Room(40000000, "서울시 옥수동", 2, "서울시 옥수동 2층 집입니다."))
        mRoomList.add(Room(6000000, "서울시 용산구", 0, "서울시 용산구 반지하 집입니다."))
        mRoomList.add(Room(170000000, "서울시 영등포동", 10, "서울시 영등포동 10층 집입니다."))
        mRoomList.add(Room(2500000, "서울시 동대문구", -1, "동대문구의 지하 1층방 입니다."))
        mRoomList.add(Room(70000000, "서울시 동대문구", 6, "동대문구의 6층방 입니다."))
        mRoomList.add(Room(800000000, "서울시 방배동", 4, "서울시 방배동 4층 집입니다."))
        mRoomList.add(Room(40000000, "서울시 옥수동", 2, "서울시 옥수동 2층 집입니다."))
        mRoomList.add(Room(6000000, "서울시 용산구", 0, "서울시 용산구 반지하 집입니다."))
        mRoomList.add(Room(170000000, "서울시 영등포동", 10, "서울시 영등포동 10층 집입니다."))
        mRoomList.add(Room(2500000, "서울시 동대문구", -1, "동대문구의 지하 1층방 입니다."))
        mRoomList.add(Room(70000000, "서울시 동대문구", 6, "동대문구의 6층방 입니다."))
    }

}
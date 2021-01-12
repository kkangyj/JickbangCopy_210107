package com.kkang.jickbangcopy_210107

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kkang.jickbangcopy_210107.data.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {



    }

    override fun setValues() {

        val room = intent.getSerializableExtra("roomInfo") as Room

        addressTxt.text = room.address
        priceTxt.text = room.getFormattedPrice()
        descTxt.text = room.descriptor
        floorTxt.text = room.getFormattedFloor()

    }


}
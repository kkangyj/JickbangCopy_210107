package com.kkang.jickbangcopy_210107.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.kkang.jickbangcopy_210107.R
import com.kkang.jickbangcopy_210107.data.Room


class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: List<Room>
) : ArrayAdapter<Room>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }
        val row = tempRow!!

        val descTxt = row.findViewById<TextView>(R.id.descTxt)
        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)

        val data = mList[position]

        descTxt.text = data.descriptor
        priceTxt.text = data.getFormattedPrice()
        addressAndFloorTxt.text = "${data.address}, ${data.getFormattedFloor()}"

        return row
    }


}
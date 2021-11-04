package com.nepplus.letsdolistview.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.nepplus.letsdolistview.Data.FriendData
import com.nepplus.letsdolistview.R

class FriendsAdapter(val mContext: Context, val resId: Int, val mList: ArrayList<FriendData>) :
    ArrayAdapter<FriendData>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.friendlinedesign, null)
        }
        val row = tempRow!!

        val friendData = mList[position]

        val txtName = row.findViewById<TextView>(R.id.txtName)
        val txtStatus = row.findViewById<TextView>(R.id.txtStatus)

        txtName.text=friendData.name
        txtStatus.text=friendData.status


        return row

    }

}
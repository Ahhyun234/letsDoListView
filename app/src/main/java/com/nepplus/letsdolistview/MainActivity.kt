package com.nepplus.letsdolistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.letsdolistview.Adapters.FriendsAdapter
import com.nepplus.letsdolistview.Data.FriendData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

        val mFriends = ArrayList<FriendData>()
        lateinit var mFriendsAdapter:FriendsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mFriends.add(FriendData("이아현","상태 좋음"))
        mFriends.add(FriendData("이지수","상태 좋음"))
        mFriends.add(FriendData("이수현","상태 좋음"))
        mFriends.add(FriendData("김현","상태 좋음"))
        mFriends.add(FriendData("최아현","상태 좋음"))
        mFriends.add(FriendData("이리","상태 좋음"))
        mFriends.add(FriendData("이현","상태 좋음"))
        mFriends.add(FriendData("심수현","상태 좋음"))
        mFriends.add(FriendData("이군","상태 좋음"))
        mFriends.add(FriendData("이동군","상태 좋음"))

        mFriendsAdapter = FriendsAdapter(this,R.layout.friendlinedesign,mFriends)
        friendListView.adapter=mFriendsAdapter

    }
}
package com.example.johnpaul.harty


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View


class ChatRoomPage: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat_room)
    }
    public fun gotoSeeFriends(view: View){
        var intent=Intent(this,FriendInParty::class.java)
        view.context.startActivity(intent)
    }
}
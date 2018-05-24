package com.example.johnpaul.harty

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View


class HomeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)
    }
    public fun chatRoomClick(view: View){
        var intent:Intent=Intent(this,ChatRoomPage::class.java)
        view.context.startActivity(intent)
    }
}
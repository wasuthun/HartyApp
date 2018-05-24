package com.example.johnpaul.harty


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View


class FriendInParty: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show_party)
    }
    public fun gotoChatParty(view: View){
        var intent:Intent = Intent(this,ChatPage::class.java)
        view.context.startActivity(intent)
    }

}
package com.example.johnpaul.harty

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.user_registation.*


class Registation: AppCompatActivity() {
    private var map=HashMap<String,String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_registation)
    }
    public fun saveIdPass(view: View){
        map.put(name.text.toString(),pass.text.toString())
        Log.d(map.toString(),"sssssssssssssss")
        val intent:Intent = Intent(this,MainActivity::class.java)
        var bundle:Bundle= Bundle()
        bundle.putSerializable("map",map)
        intent.putExtras(bundle)
        view.context.startActivity(intent)

    }
 
}

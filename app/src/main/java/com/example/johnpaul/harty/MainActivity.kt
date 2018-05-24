package com.example.johnpaul.harty

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private lateinit var map: HashMap<String, String>
    public fun pressLogIn(view:View){
       map= intent.getSerializableExtra("map") as HashMap<String, String>
        for((key,value) in map) {
            if (edit1.text.toString().equals(key) && edit2.text.toString().equals(value)) {
                val intent: Intent = Intent(this, HomeActivity::class.java)
                view.context.startActivity(intent)
            }
        }
     }
    public fun signIn(view: View){
        val intent2:Intent =  Intent(this, Registation::class.java)
        view.context.startActivity(intent2)
    }
}

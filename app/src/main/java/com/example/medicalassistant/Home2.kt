package com.example.medicalassistant

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val home_report: CardView =findViewById(R.id.home_report)
        val home_updateprofile:CardView=findViewById(R.id.home_updateprofile)
        val home_medicalassistant:CardView=findViewById(R.id.home_medicalassistant)
        val home_viewprofile:CardView=findViewById(R.id.home_viewprofile)

        home_viewprofile.setOnClickListener {
            val i=Intent(this,ViewProfile::class.java)
            startActivity(i)
        }
        home_updateprofile.setOnClickListener {
            val i=Intent(this,UpdateProfile::class.java)
            startActivity(i)
        }
        home_report.setOnClickListener {
            val i=Intent(this,Report::class.java)
            startActivity(i)
        }
        home_medicalassistant.setOnClickListener {
            val i=Intent(this,MedicalAssistant::class.java)
            startActivity(i)
        }
    }
}
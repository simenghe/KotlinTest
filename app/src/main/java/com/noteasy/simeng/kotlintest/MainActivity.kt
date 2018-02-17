package com.noteasy.simeng.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.btnSick
import kotlinx.android.synthetic.main.activity_main.editSave

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCane =findViewById<Button>(R.id.btnSick)
        val txtCane =findViewById<TextView>(R.id.txtCane)

        btnCane.setOnClickListener{
            txtCane.text="BigCane"
            var savedData=editSave.text
        }

    }
}

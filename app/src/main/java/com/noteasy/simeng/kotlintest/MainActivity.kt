package com.noteasy.simeng.kotlintest

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnCane =findViewById<Button>(R.id.btnSick)
        val txtCane =findViewById<TextView>(R.id.txtCane)
        btnCane.setOnClickListener{
            txtCane.text="BigCane"
            var savedData=editSave.text
            recycle.setBackgroundColor(Color.RED)

        }
        recycle.layoutManager= LinearLayoutManager(this) as RecyclerView.LayoutManager?
        recycle.adapter=MainAdapter()
    }
}

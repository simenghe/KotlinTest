package com.noteasy.simeng.kotlintest

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by simen on 2/17/2018.
 */
class MainAdapter: RecyclerView.Adapter<CustomViewHolder>(){
    override fun getItemCount(): Int {
        return 3
    }
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder{
        val layoutInflater=LayoutInflater.from(parent?.context)
        val cellForRow=layoutInflater.inflate(R.layout.test_row,parent,false)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {

    }
}
class CustomViewHolder (v: View): RecyclerView.ViewHolder(v){

}
package com.example.root.myapplication.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.root.myapplication.R
import kotlinx.android.synthetic.main.custom_row.view.*

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    var context:Context? = null
   constructor(context: Context){
    this.context = context
}
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder{

        var v:View = LayoutInflater.from(context).inflate(R.layout.custom_row,parent,false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.setData()
    }

    inner class MyViewHolder : RecyclerView.ViewHolder {
        var tx: TextView? = null
    constructor(itemView: View?) : super(itemView)

        public fun setData(){
            itemView.username.text = "some text"
            itemView.tagView.text = "another text you can read it from here"
        }
    }
}
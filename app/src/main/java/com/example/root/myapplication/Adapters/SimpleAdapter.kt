package com.example.root.myapplication.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.root.myapplication.R
import kotlinx.android.synthetic.main.custom_row.view.*

public class SimpleAdapter : BaseAdapter {
    var context: Context? = null

    constructor(context: Context){
        this.context = context
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View = LayoutInflater.from(context).inflate(R.layout.custom_row,parent,false)
        view.username.text = "myname"
        view.tagView.text = "this is tag"
        return view
   }

    override fun getItem(position: Int): Any {
        return 0
   }

    override fun getItemId(position: Int): Long {
    return 0
    }

    override fun getCount(): Int {
        return 3
    }

}
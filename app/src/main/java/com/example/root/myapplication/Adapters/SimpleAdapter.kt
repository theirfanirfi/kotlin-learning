package com.example.root.myapplication.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.root.myapplication.Model.SimpleListViewModel
import com.example.root.myapplication.R
import kotlinx.android.synthetic.main.custom_row.view.*

public class SimpleAdapter: BaseAdapter {

   var context: Context? = null
    private  var list: ArrayList<SimpleListViewModel>?= null

    constructor(context: Context, list: ArrayList<SimpleListViewModel>){
        this.context = context
        this.list = list
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view:View = LayoutInflater.from(context).inflate(R.layout.custom_row,parent,false)
        view.username.text = list!!.get(position).username
        view.tagView.text = list!!.get(position).tagE

        return view
   }

    override fun getItem(position: Int): Any {
        return 0
   }

    override fun getItemId(position: Int): Long {
    return 0
    }

    override fun getCount(): Int {
        return list!!.size
    }

}
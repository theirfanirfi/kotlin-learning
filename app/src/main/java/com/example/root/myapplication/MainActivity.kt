package com.example.root.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.example.root.myapplication.Adapters.SimpleAdapter
import com.example.root.myapplication.Model.Human
import com.example.root.myapplication.Model.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
          //  textView.text = "my name is not khan"
        //this is not strict type variable.
        var a = "tenga ka farmana"

        val mArr = ArrayList<Person>()
//        val mArr = arrayListOf<Person>()
        mArr.add(Person("irfan", 23))
        mArr.add(Person("shahid", 17))
        mArr.add(Person("shoaib", 14))

//       mArr.add(p)
//        var pp = Person()
//        pp.age = 23
//        mArr.add(pp)
        val p: Person = mArr.get(0)
        val pp = Person("s", 1)
        pp.height = 22
        pp.color = "some color"
        val h = Human()
        h.state = "Pakistan"
        h.height = 5

        val har = ArrayList<Human>()
        har.add(h)
        Log.i("KOTLIN LEARNING: ",h.state)
        Log.i("KOTLIN LEARNING: ",har.get(0).state)

      //  textView.text = "YOU name is: "+p.name+ " : "+pp.height.toString()+ " : "+pp.color


       var simpleAdapter =  SimpleAdapter(this)
        listView.adapter = simpleAdapter

        listView.setOnItemClickListener(AdapterView.OnItemClickListener { parent, view, position,
                                                                          id ->
            Toast.makeText(this,"working "+position.toString(),Toast.LENGTH_LONG).show()

        })


    }
}

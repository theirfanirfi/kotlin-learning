package com.example.root.myapplication.Model

//data class must have paramaterized constructor
data class Person(var name:String,var age:Int) {
    public var height:Int = 0
        get() = field

    var color:String? = null
    get() = field

}

//manipulations

//setting
//val mArr = ArrayList<Person>()
//mArr.add(Person("irfan", 23))
//mArr.add(Person("shahid", 17))
//mArr.add(Person("shoaib", 14))

//getting
//  val p: Person = mArr.get(0)
// p.name
package com.oguzavanoglu.kotlinoopproject

open class Musician(name: String, age: Int, instrument: String) {


    //encapsulation

    var name : String? = name
        private set
        get

    var age : Int? = age
        private set
        get


    private var instrument : String? = instrument


    private val bandName : String = "Metallica"

    fun returnBandName(password : String):String{
        if (password == "Oguz"){
            return bandName
        }else {
            return "wrong password"
        }
    }

}
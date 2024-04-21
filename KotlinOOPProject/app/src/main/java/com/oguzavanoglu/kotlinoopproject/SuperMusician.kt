package com.oguzavanoglu.kotlinoopproject

class SuperMusician(name: String, age: Int, instrument: String) : Musician(name, age, instrument) {

    fun sing(){
        println("Nothing else matters")
    }
}
package com.oguzavanoglu.kotlinoopproject

class Dog : Animal() {

    fun test(){
        super.sing()
    }

    override fun sing(){
        println("Dog class")
    }
}
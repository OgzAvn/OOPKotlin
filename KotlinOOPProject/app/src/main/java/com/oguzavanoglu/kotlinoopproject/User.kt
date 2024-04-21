package com.oguzavanoglu.kotlinoopproject

class User : People{

    //property
    var name : String? = null
    var age : Int? = null

    //Constructor vs init

    constructor(nameInput : String , ageInput: Int){
        this.name = nameInput
        this.age = ageInput
        println("User Created")
    }

    init {
        println("İNİT CREATED")
    }

}
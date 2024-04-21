package com.oguzavanoglu.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oguzavanoglu.kotlinoopproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        var myUser = User("Oguz",26)
        //myUser.name = "Oguz"
        //myUser.age = 26

        myUser.name = "Ertugrul"
        println(myUser.name)
        println(myUser.age)
        println( myUser.information())

        //encapsulation

        var james = Musician("james",50,"Guitar")

        //james.age = 60

        println(james.age)

        println(james.returnBandName("Oguz"))
        println(james.returnBandName("ertyus"))

        //inheritance

        var lars = SuperMusician("Lars",43,"battery")
        println(lars.name)
        println(lars.returnBandName("Oguz"))
        lars.sing()

        //Polymorphism -> Aynı ismi kullanarak farklı işlemler yapabilme özelliği

        //Static polymorphism

        var mathematics = Mathematic()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))

        //dynamic polymorphism

        val animal = Animal()
        animal.sing()

        val barley = Dog()
        barley.test()
        barley.sing()


        //abstract and interface

        //var people = People()

        var myPiano = Piano()

        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()


        //lambda expressions

        fun printString(myString : String) {
            println(myString)
        }

        printString("myteststring")

        val testString = {myString : String -> println(myString) }

        testString("my lambda string")

        val multiplyLambda = {a: Int,b : Int  -> a*b}

        println(multiplyLambda(8,4))

        val multiplyLambda2 : (Int ,Int) -> Int = {a,b -> a*b}

        println(multiplyLambda2(5,5))

        //asynchrnous

        //Genelde bir işlem uzun sürerken onu beklemeyip diğer işlemlerin devam ettirebilmesi için bunu yaparız

        //callback function , listener function , *completion* function

        fun downloadMusicians(url : String , completion : (Musician) -> Unit ){
            //url download
            //data
            val musician = Musician("Ezel",32,"Bayraktar")
            completion(musician)
        }

            downloadMusicians("metalica.com",{Musician ->
            println(Musician.name)
        })
    }
}
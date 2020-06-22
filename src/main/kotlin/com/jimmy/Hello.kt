package com.jimmy

fun main() {
//    var s:String = "abcde"
    var s:String? = "abcde"
    s = null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))

/*
    //in very rare situation, Kotlin allow you to force to run it with null
    // use !! means you want to deal with NullPointerException by yourself
    println(s!!.length)
    println(s!!.get(3))
    println(s!!.substring(3))
 */

    val h = Human(66.5f, 1.7f)
    println(h.bmi())
    val score = 88
    println(score > 60)
    val c : Char ='A'
    println(c.toInt() > 60)
    /*var age = 19
    age = 20
    var weight = 66.5f
    var name : String
    name = "Jimmy"*/
}

class Human(var weight : Float, var height : Float){
    init {
        println("test $weight")
    }
   constructor(name: String, weight: Float, height: Float) : this(weight, height)
    fun bmi() : Float {
        val bmi = weight / (height*height)
        return bmi
    }
    fun hello(){
        println("Hello kotlin")
    }
}
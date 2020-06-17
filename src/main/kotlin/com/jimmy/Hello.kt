package com.jimmy

fun main() {
//    println("Hello Kotlin")
//    Human().hello()
    val h = Human()
    h.hello()
    // Kotlin 沒有 Java 中小寫的資料型態 ex: int, short, double, long, float, char, boolean, byte....
    // Kotlin 只有物件所定義的資料型態 ex: Int, Short, Double, Long, Float, Char, Boolean, String, Byte....
    // val (value) ...  value couldn't be changed in the future
    // var (variable)... value can be changed in the future
    Byte
    val age = 19 //val age : Int = 19 --- Kotlin will guess your data type as Int base on the value you gave it
    // if you change the value of age ex: age = 20 .... it will cause some error
    var weight = 66.5 //like Java, if you have a decimal... by default, Kotlin will use double data type
    var weight2 =66.5f
    val name = "Jimmy"
    var name2 : String //if you didn't give it a value when you declare a variable...
                       // you need to declare it's data type
    name2 = "Jimmy"// then you can give it value later
}

class Human{
    fun hello(){
        println("Hello kotlin")
    }
}
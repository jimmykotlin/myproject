package com.jimmy.kotlin

import java.util.*

fun main() {
//    userInput()
    Student.pass = 50
    val stu = Student("Judy", 60, 99)
    val stu1 = Student("Jane", 44, 68)
    val stu2 = Student("Eric", 30, 49)
    stu.print()
    stu1.print()
    stu2.print()
    var test = 123
    println("Test is: $test")
//    println(stu.highest())
    println("High score: ${stu.highest()}")
}

class Student(var name:String?, var english:Int, var math: Int) {
    companion object {
        @JvmStatic
        var pass = 60
        fun test() {
            println("testing")
        }
    }

    fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    /*fun grading() : Char {
        return when(getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }
    }*/

    fun grading() = when(getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
    }

    fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
    /*fun getAverage() : Int {
        return (english+math)/2
    }*/

    fun getAverage() = (english+math)/2

    fun highest() = if (english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }

    fun nameCheck() = name?.length
    }

    /*fun nameCheck(){
        println(name?.length)
    }*/

private fun userInput() {
    val scanner = Scanner(System.`in`)
//    print("Please enter student's name:")
//    var name = scanner.next()
    var name = null
    print("Please enter student's english score:")
    var english = scanner.nextInt()
    print("Please enter student's math score:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}


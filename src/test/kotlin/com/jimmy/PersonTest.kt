package com.jimmy.kotlin

import com.jimmy.Human
import com.jimmy.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun humanBmiTest() {
        val human = Human("Jimmy", 66.5f, 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), human.bmi())
    }

    @Test
    fun personBmiTest() {
        val person = Person(66.5f, 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), person.bmi())
    }

}
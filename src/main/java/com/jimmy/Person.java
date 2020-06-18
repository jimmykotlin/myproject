package com.jimmy;

public class Person {
    //name, weight, and height 都是 Person 類別身上的一個屬性(Field or Property)
    String name;
    float weight;
    float height;
    public Person(float weight, float height) {
         this.weight = weight;
         this.height = height;
    }

    public Person(String name, float weight, float height) {
        this(weight, height);
        this.name = name;
    }

    public float bmi(){
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello(){
        System.out.println("Hello world");
    }
}

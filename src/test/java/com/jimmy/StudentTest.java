package com.jimmy;

import com.jimmy.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    void hightestScoreTest() {
        Student student = new Student("Jimmy", 60,80);
        Assertions.assertEquals(80, student.highest());
    }

    @Test
    void averageTest() {
        Student student = new Student("Jimmy",60,80);
        Assertions.assertEquals((60+80)/2, student.getAverage());
    }
}

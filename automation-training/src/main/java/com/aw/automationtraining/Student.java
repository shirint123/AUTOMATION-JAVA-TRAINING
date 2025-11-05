package com.aw.automationtraining;
class Student extends Person
 {
    String course;
    Student(String name, Integer age, String course)
    {
        super(name,age);
        this.course=course;
        System.out.println("Course = "+course);
    }
 }

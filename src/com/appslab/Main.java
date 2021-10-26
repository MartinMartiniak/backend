package com.appslab;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("John", 12345);
        System.out.println(student1.getName() + ": " + student1.getStudentNumber());
    }
}

class Student{
    private String Name;
    private int StudentNumber;

    public Student(String name, int studentNumber){
        Name = name;
        StudentNumber = studentNumber;
    }

    public String getName() {
        return Name;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }
}
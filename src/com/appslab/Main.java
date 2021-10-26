package com.appslab;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("John", 1, 1165846, "Panelakova 12");
        System.out.println(student1.getStudentNumber() + ", " + student1.getPhoneNumber() + ", " + student1.getAddress());
        Student student2 = new Student("Sam", 2, 36546984, "Chalupkova 23" );
        System.out.println(student2.getStudentNumber() + ", " + student2.getPhoneNumber() + ", " + student2.getAddress());
    }
}

class Student{
    private String Name;
    private int StudentNumber;
    private int PhoneNumber;
    private String Address;

    public Student(String name, int studentNumber, int phoneNumber, String address){
        Name = name;
        StudentNumber = studentNumber;
        PhoneNumber = phoneNumber;
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }
    public int getPhoneNumber(){
        return PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }
}
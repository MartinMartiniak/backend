package com.appslab;

import java.util.Date;

public class Employee {
    private String Name;
    private String Surname;
    private String Dateofbirth;
    private String JobPos;
    private double Salary;

    public Employee(String name,String surname, String dateofbirth, String jobPos, double salary){
        Name=name;
        Surname=surname;
        Dateofbirth=dateofbirth;
        JobPos=jobPos;
        Salary=salary;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getDateofbirth() {
        return Dateofbirth;
    }

    public String getJobPos() {
        return JobPos;
    }

    public double getSalary() {
        return Salary;
    }
}

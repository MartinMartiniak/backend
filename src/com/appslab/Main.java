package com.appslab;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Jozko","Mrkvicka","1.5.1993","IT programmer", 2100);
        System.out.println(employee1.getName() + employee1.getSurname() + ", " + employee1.getJobPos() + ", " + employee1.getSalary()+"€");
    }
}

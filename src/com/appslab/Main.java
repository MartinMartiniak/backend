package com.appslab;

public class Main {

    public static void main(String[] args) {
        Person person1=new Person("John",21,23000);
        Person person2=new Person("Steve",32,40000);
        Person person3=new Person("Martin",16,2700);

        Person[] people ={person1,person2,person3};
        for(Person person:people)
        {
            System.out.println("Name: "+person.getName()+", "+"Age: "+person.getAge()+", "+"Budget: "+person.getBudget());
        }
        System.out.println("Budget: "+Person.returnBudget(people));
    }
}

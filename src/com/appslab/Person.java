package com.appslab;

public class Person {
    private String name;
    private int age;
    private int budget;
    public Person(String name,int age,int budget){
        this.name=name;
        this.age=age;
        this.budget=budget;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBudget() {
        return budget;
    }
    public static int returnBudget(Person[] people){
      int aid=0;
      for(Person human:people){
          aid+= human.getBudget();
      };
      return aid;
    };
}

package com.appslab;

public class Main {

    public static void main(String[] args){
        Triangle triangle1 = new Triangle(3,4,5);


        System.out.println("Area:"+ Triangle.getArea(triangle1.getSidea(),triangle1.getSideb(),triangle1.getSidec()));
        System.out.println("Perimeter:"+Triangle.getPerimeter(triangle1.getSidea(),triangle1.getSideb(),triangle1.getSidec()));
    };
}

package com.appslab;

public class Main {

    public static void main(String[] args) {


        Warrior warrior1 = new Warrior("warrior1",10,4,7);
        Warrior warrior2 = new Warrior("warrior2",9,5,3);

        Warrior.battle(warrior1, warrior2);
    }
}

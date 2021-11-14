package com.appslab;

import java.util.List;

public class Warrior {
    private String name;
    private int life;
    private int speed;
    private int muscle;
    private List<Item> items;

    public Warrior(String name, int life, int speed, int muscle, List<Item> items) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.items = items;
    }
    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMuscle() {
        return muscle;
    }

    public List<Item> getItems() {
        return items;
    }

    public static void battle(Warrior warrior1, Warrior warrior2) {

        if (warrior1.muscle + warrior1.life + warrior1.speed > warrior2.muscle + warrior2.life + warrior2.speed) {
            System.out.println("1");
            warrior2.life --;
            System.out.println("Warrior 1 life:"+warrior1.life);
            System.out.println("Warrior 2 life:"+warrior2.life);
        }
        else if(warrior1.muscle + warrior1.life + warrior1.speed < warrior2.muscle + warrior2.life + warrior2.speed){
            System.out.println("2");
            warrior1.life --;
            System.out.println("Warrior 1 life:"+warrior1.life);
            System.out.println("Warrior 2 life:"+warrior2.life);
        }
        else if(warrior1.muscle + warrior1.life + warrior1.speed == warrior2.muscle + warrior2.life + warrior2.speed){
            System.out.println("0");
            System.out.println("Warrior 1 life:"+warrior1.life);
            System.out.println("Warrior 2 life:"+warrior2.life);
        }
    }
}


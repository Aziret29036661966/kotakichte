package com.company;

public class Main {

    public static void main(String[] args) {
        for (Hero dad: CreateHeroes()
             ) {
            System.out.println(dad);
        }
    }

    public static Hero[] CreateHeroes(){
Hero hero = new Hero("Thor","Zeus","Daun");
        Hero [] ss = new Hero[] {hero};
        return ss;
    }
}

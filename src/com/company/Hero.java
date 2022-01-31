package com.company;

public class Hero {
    private String name, name1, name2;

    public Hero(String name, String name1, String name2) {
        this.name = name;
        this.name1 = name1;
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }
}


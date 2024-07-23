package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    public Lion(String sex, KittenInterface lion) throws Exception {
        this.lion = lion;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - Cамец или Cамка");
        }
    }

    private final KittenInterface lion;

    public int getLionKittens() {
        return lion.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        Animal lion = new Animal();
        return lion.getFood("Хищник");
    }
}

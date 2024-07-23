package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    private final KittenInterface feline;

    public Feline(KittenInterface feline) {
        this.feline = feline;
    }

    public int getFelineKittens() {
        return feline.getKittens();
    }

    public int getFelineKittens(int n) {
        return feline.getKittens(n);
    }
}

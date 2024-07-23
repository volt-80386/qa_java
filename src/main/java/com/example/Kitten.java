package com.example;

public class Kitten implements KittenInterface {
    @Override
    public int getKittens() {
        return getKittens(1);
    }
    @Override
    public int getKittens(int kittensCount) {
        return kittensCount;
    }
}
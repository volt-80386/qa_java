package com.example;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;

public class AnimalTest {

    Animal animal = new Animal();

    @Test
    public void test() {
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    @Test
    public void test2() {
        try {
            animal.getFood("Насекомое");
        }
        catch (Exception exception) {
            assertTrue("Неизвестный вид животного, используйте значение Травоядное или Хищник".contains(exception.getMessage()));
        }
    }
}
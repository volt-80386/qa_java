package com.example;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import java.util.List;

public class LionTest {

    KittenInterface feline = new Kitten();

    @Test
    public void exceptionTest() {
        try {
            Lion lion = new Lion("Неопределенный", feline);
        }
        catch (Exception exception) {
            assertTrue("Используйте допустимые значения пола животного - Cамец или Cамка".contains(exception.getMessage()));
        }
    }

    @Test
    public void getLionKittensTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals(1, lion.getLionKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
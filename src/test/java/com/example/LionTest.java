package com.example;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class LionTest {

    KittenInterface feline = new Kitten();

    @Test
    public void test() {
        try {
            Lion lion = new Lion("Неопределенный", feline);
        }
        catch (Exception exception) {
            assertTrue("Используйте допустимые значения пола животного - Cамец или Cамка".contains(exception.getMessage()));
        }
    }

    @Test
    public void test2() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals(1, lion.getLionKittens());
    }

    @Test
    public void test3() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
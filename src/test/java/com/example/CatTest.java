package com.example;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    KittenInterface kitten = new Kitten();

    @Mock
    Cat cat = new Cat(new Feline(kitten));

    @Test
    public void test() throws Exception {
        cat.getFood();
        Mockito.verify(cat).getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), new Cat(new Feline(kitten)).getFood());
    }

    @Test
    public void test2() throws Exception {
        cat.getSound();
        Mockito.verify(cat).getSound();
        Assert.assertEquals("Мяу", new Cat(new Feline(kitten)).getSound());
    }
}
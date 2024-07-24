package com.example;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    KittenInterface kitten = new Kitten();

    @Mock
    Cat cat = new Cat(new Feline(kitten));

    @Test
    public void getFoodTest() throws Exception {
        cat.getFood();
        Mockito.verify(cat).getFood();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), new Cat(new Feline(kitten)).getFood());
        // Первый объект Cat - это мок, и метод ничего не возвращает (получаем AssertionError)
        // А Assert нужен, чтобы Jacoco "засчитал" тест и учел в покрытии, поэтому метод вызывается с реальным объектом
    }

    @Test
    public void getSoundTest() {
        cat.getSound();
        Mockito.verify(cat).getSound();
        Assert.assertEquals("Мяу", new Cat(new Feline(kitten)).getSound());
    }
}
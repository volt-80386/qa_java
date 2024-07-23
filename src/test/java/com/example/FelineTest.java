package com.example;

import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    KittenInterface kitten = new Kitten();

    @Mock
    Feline feline = new Feline(kitten);

    @Test
    public void test() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), new Feline(kitten).eatMeat());
    }

    @Test
    public void test2() {
        feline.getFamily();
        Mockito.verify(feline).getFamily();
        Assert.assertEquals("Кошачьи", new Feline(kitten).getFamily());
    }

    @Test
    public void test3() {
        feline.getFelineKittens(2);
        Mockito.verify(feline).getFelineKittens(2);
        Assert.assertEquals(2, new Feline(kitten).getFelineKittens(2));
    }

    @Test
    public void test4() {
        feline.getFelineKittens();
        Mockito.verify(feline).getFelineKittens();
        Assert.assertEquals(1, new Feline(kitten).getFelineKittens());
    }
}
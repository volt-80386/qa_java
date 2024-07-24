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
    public void eatMeatTest() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).eatMeat();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), new Feline(kitten).eatMeat());
    }

    @Test
    public void getFamilyTest() {
        feline.getFamily();
        Mockito.verify(feline).getFamily();
        Assert.assertEquals("Кошачьи", new Feline(kitten).getFamily());
    }

    @Test
    public void getFelineKittensWithParametersTest() {
        feline.getFelineKittens(2);
        Mockito.verify(feline).getFelineKittens(2);
        Assert.assertEquals(2, new Feline(kitten).getFelineKittens(2));
    }

    @Test
    public void getFelineKittensWithoutParametersTest() {
        feline.getFelineKittens();
        Mockito.verify(feline).getFelineKittens();
        Assert.assertEquals(1, new Feline(kitten).getFelineKittens());
    }
}
package com.example;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;

public class AnimalTest {

    Animal animal = new Animal();

    @Test
    public void getFamilyTest() {
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    @Test
    public void getFoodExceptionTest() {
        try {
            animal.getFood("Насекомое");
            // Это именно тест Исключения - т.е. передается заведомо недопустимое значение
            // А корректные значения тестируются в отдельном классе ParametrizedTest
        }
        catch (Exception exception) {
            assertTrue("Неизвестный вид животного, используйте значение Травоядное или Хищник".contains(exception.getMessage()));
        }
    }
}
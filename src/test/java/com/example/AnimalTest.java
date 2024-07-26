package com.example;

import org.junit.Test;
import org.junit.Assert;

public class AnimalTest {

    Animal animal = new Animal();

    @Test
    public void getFamilyTest() {
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    @Test
    public void getFoodExceptionTest() {
        String check = null;
        try {
            animal.getFood("Насекомое");
        } catch (Exception exception) {
            Assert.assertTrue("Неизвестный вид животного, используйте значение Травоядное или Хищник".contains(exception.getMessage()));
            // Тогда так - сохраняем сообщение произошедшего исключения в переменную
            check = exception.getMessage();
        }
        // и за пределами try...catch сравниваем текст исключения с содержимым переменной - если исключение выше не произойдет, то и тест не пройдет
        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", check);
    }
}
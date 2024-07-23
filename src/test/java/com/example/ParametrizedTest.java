package com.example;

import org.junit.Test;
import org.junit.Assert;
import java.util.Arrays;
import java.util.List;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Enclosed.class)
public class ParametrizedTest {

    @RunWith(Parameterized.class)
    public static class AnimalTest {

        private final String animalType;
        private final List<String> food;

        public AnimalTest(String animalType, List<String> food) {
            this.animalType = animalType;
            this.food = food;

        }

        @Parameterized.Parameters
        public static Object[][] getAnimalData() {
            return new Object[][]{
                    {"Травоядное", Arrays.asList("Трава", "Различные растения")},
                    {"Хищник", Arrays.asList("Животные", "Птицы", "Рыба")},
            };
        }

        Animal animal = new Animal();

        @Test
        public void test() throws Exception {
            Assert.assertEquals(food, animal.getFood(animalType));
        }
    }

    @RunWith(Parameterized.class)
    public static class LionTest {

        private final String animalSex;
        private final boolean mane;

        public LionTest(String animalSex, boolean mane) {
            this.animalSex = animalSex;
            this.mane = mane;
        }

        @Parameterized.Parameters
        public static Object[][] testMane() {
            return new Object[][] {
                    {"Самец", true},
                    {"Самка", false},
            };
        }

        KittenInterface feline = new Kitten();

        @Test
        public void test() throws Exception {
            Lion lion = new Lion(animalSex, feline);
            Assert.assertEquals(mane, lion.doesHaveMane());
        }
    }
}
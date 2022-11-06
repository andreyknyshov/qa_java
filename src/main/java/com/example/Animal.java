package com.example;

import java.util.List;

public class Animal {

    public final static List<String> PREDATOR_FOOD = List.of("Животные", "Птицы", "Рыба");
    public final static String PREDATOR_TYPE = "Хищник";

    public List<String> getFood(String animalKind) throws Exception {
        if ("Травоядное".equals(animalKind)) {
            return List.of("Трава", "Различные растения");
        } else if (PREDATOR_TYPE.equals(animalKind)) {
            return PREDATOR_FOOD;
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    public String getFamily() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }
}
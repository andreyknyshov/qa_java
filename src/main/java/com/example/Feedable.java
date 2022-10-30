package com.example;

import java.util.List;

public interface Feedable {
    List<String> getFood(String animalKind) throws Exception;
}

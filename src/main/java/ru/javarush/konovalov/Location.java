package ru.javarush.konovalov;

import ru.javarush.konovalov.animals.Animal;
import ru.javarush.konovalov.animals.Wolf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Location {
    public Map<Class<? extends Animal>, List<Animal>> getAnimalsMap() {
        return animalsMap;
    }

    private final Map<Class<? extends Animal>, List<Animal>> animalsMap = new HashMap<>();

    public Location() {
        animalsMap.put(Wolf.class, new ArrayList<>() {{
            add(new Wolf(30, 3, 8, 8));
        }});
    }

    @Override
    public String toString() {
        return "Location" + Integer.toHexString(hashCode());
    }
}

package ru.javarush.konovalov.models;

import ru.javarush.konovalov.models.Animal;
import ru.javarush.konovalov.models.predators.Wolf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Location {
    private Coordinate coordinate;
    public Map<Class<? extends Animal>, List<Animal>> getAnimalsMap() {
        return animalsMap;
    }

    private final Map<Class<? extends Animal>, List<Animal>> animalsMap = new HashMap<>();

    public Location(Coordinate coordinate, int number) {
        this.coordinate = coordinate;
        animalsMap.put(Wolf.class, new ArrayList<>() {{
            add(new Wolf(30, number, 8, 8));
        }});
    }

    @Override
    public String toString() {
        return "Location" + " X " +  coordinate.getX() + " Y " + coordinate.getY() ;
    }
}

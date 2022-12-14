package ru.javarush.konovalov.models.predators;

import ru.javarush.konovalov.models.Animal;
import ru.javarush.konovalov.models.Coordinate;

public abstract class CarnivoreAnimal extends Animal {
    public CarnivoreAnimal(int weight, int speed, double maxSatiety, double currentSatiety, Coordinate coordinate) {
        super(weight, speed, maxSatiety, currentSatiety, coordinate);
    }
}

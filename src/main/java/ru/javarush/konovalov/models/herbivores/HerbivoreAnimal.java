package ru.javarush.konovalov.models.herbivores;

import ru.javarush.konovalov.models.Animal;
import ru.javarush.konovalov.models.Coordinate;

public abstract class HerbivoreAnimal extends Animal {
    public HerbivoreAnimal(int weight, int speed, double maxSatiety, double currentSatiety, Coordinate coordinate) {
        super(weight, speed, maxSatiety, currentSatiety, coordinate);
    }
}

package ru.javarush.konovalov.models.predators;

import ru.javarush.konovalov.models.Animal;
import ru.javarush.konovalov.models.Coordinate;

public class Python extends  CarnivoreAnimal implements Predator {
    public Python(int weight, int speed, double maxSatiety, double currentSatiety, Coordinate coordinate) {
        super(weight, speed, maxSatiety, currentSatiety, coordinate);
    }

    public void eat(Animal animal) {

    }
}

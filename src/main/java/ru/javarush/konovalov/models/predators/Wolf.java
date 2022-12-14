package ru.javarush.konovalov.models.predators;

import ru.javarush.konovalov.models.Animal;
import ru.javarush.konovalov.models.Coordinate;

public class Wolf extends CarnivoreAnimal implements Predator {

    public Wolf(int weight, int speed, double maxSatiety, double currentSatiety, Coordinate coordinate) {
        super(weight, speed, maxSatiety, currentSatiety, coordinate);
    }

    @Override
    public String toString() {
        return "Wolf{}" + "вес" + super.getSpeed() + " " + super.getCoordinate().getX() + " " + super.getCoordinate().getY();
    }
}

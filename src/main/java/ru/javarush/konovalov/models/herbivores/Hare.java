package ru.javarush.konovalov.models.herbivores;

import ru.javarush.konovalov.models.Animal;
import ru.javarush.konovalov.models.Coordinate;
import ru.javarush.konovalov.models.Plant;

public class Hare extends Animal {
    public Hare(int weight, int speed, double maxSatiety, double currentSatiety, Coordinate coordinate) {
        super(weight, speed, maxSatiety, currentSatiety, coordinate);
    }

    public void eat(Plant plant) {

    }

    @Override
    public String toString() {
        return "Hare{}" + super.getSpeed();
    }
}

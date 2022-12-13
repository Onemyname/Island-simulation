package ru.javarush.konovalov.models.predators;

import ru.javarush.konovalov.models.Animal;

public class Wolf extends Animal {

    public Wolf(int weight, int speed, double maxSatiety, double currentSatiety) {
        super(weight, speed, maxSatiety, currentSatiety);
    }

    public void eat(Animal animal) {

    }

    @Override
    public String toString() {
        return "Wolf{}" + "вес" + super.getSpeed() ;
    }
}

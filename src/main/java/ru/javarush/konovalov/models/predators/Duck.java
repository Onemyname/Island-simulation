package ru.javarush.konovalov.models.predators;

import ru.javarush.konovalov.models.Animal;
import ru.javarush.konovalov.models.Plant;

public class Duck extends Animal {

    public Duck(int weight, int speed, double maxSatiety, double currentSatiety) {
        super(weight, speed, maxSatiety, currentSatiety);
    }

    public void eat(Plant plant) {

    }

    public void eat(Animal animal) {

    }
}

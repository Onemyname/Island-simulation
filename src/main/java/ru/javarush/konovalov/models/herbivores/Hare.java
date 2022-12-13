package ru.javarush.konovalov.models.herbivores;

import ru.javarush.konovalov.models.Animal;
import ru.javarush.konovalov.models.Plant;

public class Hare extends Animal {
    public Hare(int weight, int speed, double maxSatiety, double currentSatiety) {
        super(weight, speed, maxSatiety, currentSatiety);
    }

    public void eat(Plant plant) {

    }
}

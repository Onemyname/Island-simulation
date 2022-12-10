package ru.javarush.konovalov.animals;

public class Hare extends Animal implements Herbivore{
    public Hare(int weight, int speed, double maxSatiety, double currentSatiety) {
        super(weight, speed, maxSatiety, currentSatiety);
    }

    public void eat(Plant plant) {

    }
}

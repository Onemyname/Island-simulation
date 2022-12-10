package ru.javarush.konovalov.animals;

public class Duck extends Animal implements Herbivore, Predatory{

    public Duck(int weight, int speed, double maxSatiety, double currentSatiety) {
        super(weight, speed, maxSatiety, currentSatiety);
    }

    public void eat(Plant plant) {

    }

    public void eat(Animal animal) {

    }
}

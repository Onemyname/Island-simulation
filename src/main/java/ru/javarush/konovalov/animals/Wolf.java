package ru.javarush.konovalov.animals;

public class Wolf extends Animal implements Predatory{

    public Wolf(int weight, int speed, double maxSatiety, double currentSatiety) {
        super(weight, speed, maxSatiety, currentSatiety);
    }

    public void eat(Animal animal) {

    }

}

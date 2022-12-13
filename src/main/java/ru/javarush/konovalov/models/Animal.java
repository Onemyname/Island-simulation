package ru.javarush.konovalov.models;

import lombok.Data;

@Data
public abstract class Animal extends GameObject {

    public Animal(int weight, int speed, double maxSatiety, double currentSatiety) {
        this.weight = weight;
        this.speed = speed;
        this.maxSatiety = maxSatiety;
        this.currentSatiety = currentSatiety;
    }

    private int weight;
    private int speed;
    private double maxSatiety;
    private double currentSatiety;
}
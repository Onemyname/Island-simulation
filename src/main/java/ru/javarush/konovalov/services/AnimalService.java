package ru.javarush.konovalov.services;

import ru.javarush.konovalov.models.Animal;
import ru.javarush.konovalov.models.herbivores.Hare;

import java.util.List;

public class AnimalService {

    public void eat(){
//        if(){
//
//        }
//        else{
//
//        }
    }

    private void eatAnimal(Animal prey, List<Animal> ration){
        if(prey instanceof Hare){
            System.out.println("волк сожрал зайца");
        }
    }

    public List<Animal> getRation(Animal animal){

        return null;
    }

    private void eatPlant(){

    }
}
package ru.javarush.konovalov.services;

import ru.javarush.konovalov.models.Animal;
import ru.javarush.konovalov.models.Coordinate;
import ru.javarush.konovalov.models.Location;
import ru.javarush.konovalov.models.herbivores.Hare;
import ru.javarush.konovalov.models.herbivores.HerbivoreAnimal;
import ru.javarush.konovalov.models.predators.*;
import ru.javarush.konovalov.repositories.IslandRepository;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class AnimalService {
    private final Map<Class<? extends Animal>, Map<Class<? extends Animal>, Double>> globalRation
            = new HashMap<>() {{
        put(Wolf.class, new HashMap<>() {{
            put(Hare.class, 0.9);
            put(Duck.class, 0.8);
        }});
        put(Python.class, new HashMap<>() {{
            put(Hare.class, 0.4);
            put(Duck.class, 0.2);
        }});
    }};


    private final IslandRepository islandRepository;

    public AnimalService(IslandRepository islandRepository) {
        this.islandRepository = islandRepository;
    }

    public void eat(Animal hungryAnimal) {
        Coordinate currentCoordinate = hungryAnimal.getCoordinate();
        Location location = islandRepository.getLocation(currentCoordinate);

        if (hungryAnimal instanceof HerbivoreAnimal) {
            eatPlant(hungryAnimal,location);
        } else if (hungryAnimal instanceof Predator) {
            eatAnimal(hungryAnimal, location);
        }

    }
        private void eatAnimal (Animal hungryAnimal, Location location) { // todo put parameters
            Map<Class<? extends Animal>, List<Animal>> animalsInLocation = location.getAnimalsMap();
            Map<Class<? extends Animal>, Double> rationPercentage = globalRation.get(hungryAnimal.getClass());

            if (rationPercentage.isEmpty()) {
                return;
            }

            for (Map.Entry<Class<? extends Animal>, Double> preyClass : rationPercentage.entrySet()) {

                if (animalsInLocation.isEmpty() || preyClass == null) {
                    return;
                }

                List<Animal> preys = animalsInLocation.getOrDefault(preyClass, new ArrayList<>());   // todo предусмотреть NullPointerException


                if (!preys.isEmpty()) {
                    Animal prey = preys.get(0);                                  // todo добавить рандом на выбор жертвы

                    boolean isKilled = Math.random() < preyClass.getValue();          // todo вызвать метод рандомайзера
                    //   isKilled = 0.56 < 0.9
                    if (isKilled) {
                        hungryAnimal.setCurrentSatiety(prey.getWeight());

                        // todo как накормить волка, удалить зайца
                        return;
                    }
                    // todo волк пропускает ход
                    return;
                }
            }
        }

    private void eatPlant(Animal hungryAnimal, Location location) {

    }
}
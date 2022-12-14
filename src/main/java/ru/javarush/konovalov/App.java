package ru.javarush.konovalov;

import ru.javarush.konovalov.models.Coordinate;
import ru.javarush.konovalov.repositories.IslandRepository;
import ru.javarush.konovalov.models.Location;
import ru.javarush.konovalov.models.Animal;
import ru.javarush.konovalov.services.AnimalService;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        IslandRepository island = new IslandRepository(2, 2);
        AnimalService animalService = new AnimalService(island);





        System.out.println(island.getLocation(new Coordinate(0,1)));
        System.out.println(island.getLocation(new Coordinate(1,1)));


        island.getAnimalsInLocation(new Coordinate(0, 1)).forEach((key, value) -> System.out.println(value));
        island.getAnimalsInLocation(new Coordinate(1, 1)).forEach((key, value) -> System.out.println(value));


//        System.out.println(island.getIslandMap().entrySet());
//        System.out.println(island.getIslandMap().values());

//        for (Location location : island.getIslandMap().values()) {
//
//            for (Map.Entry<Class<? extends Animal>, List<Animal>> classListEntry : location.getAnimalsMap().entrySet()) {
//
//            var myList = classListEntry.getValue();
//            var myType = classListEntry.getKey();
//                System.out.println(myList);
//            }
//        }
//
//        Animal barabaka = new Wolf(1,1,1,1);
//        System.out.println(barabaka);
    }
}

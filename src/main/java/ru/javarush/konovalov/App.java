package ru.javarush.konovalov;

import ru.javarush.konovalov.animals.Animal;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Island island = new Island(2, 2);

//        System.out.println(island.getIslandMap().entrySet());
//        System.out.println(island.getIslandMap().values());

        for (Location location : island.getIslandMap().values()) {

            for (Map.Entry<Class<? extends Animal>, List<Animal>> classListEntry : location.getAnimalsMap().entrySet()) {

            var myList = classListEntry.getValue();
            var myType = classListEntry.getKey();
                System.out.println();
            }
        }
    }
}

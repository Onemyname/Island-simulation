package ru.javarush.konovalov.repositories;

import ru.javarush.konovalov.models.Animal;
import ru.javarush.konovalov.models.Coordinate;
import ru.javarush.konovalov.models.Location;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IslandRepository {

    public Map<Coordinate, Location> getIslandMap() {
        return islandMap;
    }

    private final Map<Coordinate, Location> islandMap = new HashMap<>();

    public IslandRepository(int width, int height){
        for (int y = 0; y < width; y++) {
            for (int x = 0; x < height; x++) {
                Coordinate coordinate = new Coordinate(x, y);
                islandMap.put(coordinate, new Location(coordinate,x));
            }
        }
    }

    public Location getLocation(Coordinate coordinate){

        return getIslandMap().get(coordinate);
    }

    public Map<Class<? extends Animal>, List<Animal>> getAnimalsInLocation(Coordinate coordinate){
        Location location = getLocation(coordinate);

        return location.getAnimalsMap();
    }



}

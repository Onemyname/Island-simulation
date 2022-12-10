package ru.javarush.konovalov;

import java.util.HashMap;
import java.util.Map;

public class Island {

    public Map<Coordinate, Location> getIslandMap() {
        return islandMap;
    }

    private final Map<Coordinate, Location> islandMap = new HashMap<>();

    public Island(int width, int height){
        for (int y = 0; y < width; y++) {
            for (int x = 0; x < height; x++) {
                islandMap.put(new Coordinate(x,y), new Location());
            }
        }

    }




}

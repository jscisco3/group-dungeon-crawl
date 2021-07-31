package com.jscisco.rl.zone;

public class LevelFactory {

    public static Level emptyLevel(int width, int height) {
        Terrain[][] terrain = new Terrain[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                terrain[x][y] = TerrainFactory.floor();
            }
        }
        for (int x = 0; x < width; x++) {
            terrain[x][0] = TerrainFactory.wall();
            terrain[x][height - 1] = TerrainFactory.wall();
        }
        for (int y = 0; y < height; y++) {
            terrain[0][y] = TerrainFactory.wall();
            terrain[width - 1][y] = TerrainFactory.wall();
        }
        // Wall here
        // TODO
        return new Level(terrain);
    }
}

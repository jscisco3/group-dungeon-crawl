package com.jscisco.rl.zone;

import java.util.List;

public class Zone {
    String name;
    List<Level> levels;

    public Zone() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }
}

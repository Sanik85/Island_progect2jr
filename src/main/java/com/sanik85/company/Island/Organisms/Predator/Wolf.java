package com.sanik85.company.Island.Organisms.Predator;

import com.sanik85.company.Island.IslandMap.Cell;
import org.yaml.snakeyaml.events.Event;

public class Wolf extends Predator{

    public final String NAME  = "Wolf";
    public final int WEIGHT = 50;
    public final String ICON = "\uD83D\uDC3A";
    public final int MAX_VALUES_ON_CELL = 30;
    public final int MAX_MOVE = 3;
    public final int AMOUNT_OF_FOOD = 8;

    public int getMAX_VALUES_ON_CELL() {
        return MAX_VALUES_ON_CELL;
    }

    private Cell cell;

    @Override
    public String toString() {
        return "Wolf{" +
                "NAME='" + NAME + '\'' +
                ", ICON='" + ICON + '\'' +
                '}';
    }
}

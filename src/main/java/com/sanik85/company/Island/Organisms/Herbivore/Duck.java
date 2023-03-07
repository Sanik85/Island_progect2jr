package com.sanik85.company.Island.Organisms.Herbivore;

import com.sanik85.company.Island.IslandMap.Cell;

public class Duck extends Herbivore{
    public final String NAME = "Duck";
    public final int WEIGHT = 1;
    public final String ICON = "\uD83E\uDD86";
    public final int MAX_VALUES_ON_CELL = 200;
    public final int MAX_MOVE = 4;
    public final double AMOUNT_OF_FOOD = 0.15;
    private Cell cell;
}

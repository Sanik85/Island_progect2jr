package com.sanik85.company.Island.Organisms.Predator;

import com.sanik85.company.Island.IslandMap.Cell;

public class Eagle extends Predator{
    public final String NAME = "Eagle";
    public final int WEIGHT = 6;
    public final String ICON = "\uD83E\uDD85";
    public final int MAX_VALUES_ON_CELL = 20;
    public final int MAX_MOVE = 3;
    public final int AMOUNT_OF_FOOD = 1;
    private Cell cell;
}

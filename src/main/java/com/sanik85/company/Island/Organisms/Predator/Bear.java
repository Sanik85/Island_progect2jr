package com.sanik85.company.Island.Organisms.Predator;

import com.sanik85.company.Island.IslandMap.Cell;

public class Bear extends Predator{
    public final String NAME = "Bear";
    public final int WEIGHT = 500;
    public final String ICON = "\uD83D\uDC3B";
    public final int MAX_VALUES_ON_CELL = 5;
    public final int MAX_MOVE = 2;
    public final int AMOUNT_OF_FOOD = 80;
    private Cell cell;
}

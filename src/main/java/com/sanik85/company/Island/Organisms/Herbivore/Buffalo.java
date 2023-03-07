package com.sanik85.company.Island.Organisms.Herbivore;

import com.sanik85.company.Island.IslandMap.Cell;

public class Buffalo extends Herbivore{
    public final String NAME = "Buffalo";
    public final int WEIGHT = 700;
    public final String ICON = "\uD83D\uDC03";
    public final int MAX_VALUES_ON_CELL = 10;
    public final int MAX_MOVE = 3;
    public final int AMOUNT_OF_FOOD = 100;
    private Cell cell;
}

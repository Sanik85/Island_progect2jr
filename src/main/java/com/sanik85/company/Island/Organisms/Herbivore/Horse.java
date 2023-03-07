package com.sanik85.company.Island.Organisms.Herbivore;

import com.sanik85.company.Island.IslandMap.Cell;

public class Horse extends Herbivore{
    public final String NAME = "Horse";
    public final int WEIGHT = 400;
    public final String ICON = "\uD83D\uDC0E";
    public final int MAX_VALUES_ON_CELL = 20;
    public final int MAX_MOVE = 4;
    public final int AMOUNT_OF_FOOD = 60;
    private Cell cell;
}

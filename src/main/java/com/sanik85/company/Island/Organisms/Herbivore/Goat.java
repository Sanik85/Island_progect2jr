package com.sanik85.company.Island.Organisms.Herbivore;

import com.sanik85.company.Island.IslandMap.Cell;

public class Goat extends Herbivore{
    public final String NAME = "Goat";
    public final int WEIGHT = 60;
    public final String ICON = "\uD83D\uDC10";
    public final int MAX_VALUES_ON_CELL = 140;
    public final int MAX_MOVE = 3;
    public final int AMOUNT_OF_FOOD = 10;
    private Cell cell;
}

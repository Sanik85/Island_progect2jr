package com.sanik85.company.Island.Organisms.Herbivore;

import com.sanik85.company.Island.IslandMap.Cell;

public class Sheep extends Herbivore{
    public final String NAME = "Sheep";
    public final int WEIGHT = 70;
    public final String ICON = "\uD83D\uDC11";
    public final int MAX_VALUES_ON_CELL = 140;
    public final int MAX_MOVE = 3;
    public final int AMOUNT_OF_FOOD = 15;
    private Cell cell;
}

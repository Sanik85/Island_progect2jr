package com.sanik85.company.Island.Organisms.Herbivore;

import com.sanik85.company.Island.IslandMap.Cell;

public class Mouse extends Herbivore{
    public final String NAME = "Mouse";
    public final double WEIGHT = 0.05;
    public final String ICON = "\uD83D\uDC2D";
    public final int MAX_VALUES_ON_CELL = 500;
    public final int MAX_MOVE = 1;
    public final double AMOUNT_OF_FOOD = 0.01;
    private Cell cell;
}

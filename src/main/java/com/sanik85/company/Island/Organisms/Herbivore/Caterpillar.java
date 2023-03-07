package com.sanik85.company.Island.Organisms.Herbivore;

import com.sanik85.company.Island.IslandMap.Cell;

public class Caterpillar extends Herbivore{
    public final String NAME = "Caterpillar";
    public final double WEIGHT = 0.01;
    public final String ICON = "\uD83D\uDC1B";
    public final int MAX_VALUES_ON_CELL = 1000;
    public final int MAX_MOVE = 0;
    public final int AMOUNT_OF_FOOD = 0;
    private Cell cell;
}

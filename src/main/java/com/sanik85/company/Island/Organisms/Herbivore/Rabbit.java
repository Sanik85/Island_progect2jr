package com.sanik85.company.Island.Organisms.Herbivore;

import com.sanik85.company.Island.IslandMap.Cell;

public class Rabbit extends Herbivore{
    public final String NAME = "Rabbit";
    public final int WEIGHT = 2;
    public final String ICON = "\uD83D\uDC30";
    public final int MAX_VALUES_ON_CELL = 150;
    public final int MAX_MOVE = 2;
    public final double AMOUNT_OF_FOOD = 0.45;
    private Cell cell;
}

package com.sanik85.company.Island.Organisms.Predator;

import com.sanik85.company.Island.IslandMap.Cell;

public class Fox extends Predator{
    public final String NAME = "Fox";
    public final int WEIGHT = 8;
    public final String ICON = "\uD83E\uDD8A";
    public final int MAX_VALUES_ON_CELL = 30;
    public final int MAX_MOVE = 2;
    public final int AMOUNT_OF_FOOD = 2;
    private Cell cell;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Fox();
    }
}

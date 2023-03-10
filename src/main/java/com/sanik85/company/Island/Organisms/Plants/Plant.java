package com.sanik85.company.Island.Organisms.Plants;


import com.sanik85.company.Island.AbstractOrganisms.Organism;
import com.sanik85.company.Island.IslandMap.Cell;

public class Plant extends Organism {

    public static final String NAME = "Plant";
    public static final int WEIGHT = 1;
    public static final String ICON = "\uD83C\uDF31";
    public static final int MAX_VALUES_ON_CELL = 200;
    private Cell cell;

    public Plant grow(){
        return new Plant();
    }

    @Override
    public Cell getCell() {
        return this.cell;
    }

    @Override
    public void setCell(Cell ceel) {
        this.cell = ceel;
    }

    @Override
    public int getMaxMove() {
        return 0;
    }


    @Override
    public int getMaxAmountOnCell() {
        return this.MAX_VALUES_ON_CELL;
    }
}

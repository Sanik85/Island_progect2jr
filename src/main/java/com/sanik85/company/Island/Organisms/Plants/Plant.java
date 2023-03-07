package com.sanik85.company.Island.Organisms.Plants;


import com.sanik85.company.Island.AbstractOrganisms.Organism;
import com.sanik85.company.Island.IslandMap.Cell;

public class Plant extends Organism {

    public final String NAME = "Plant";
    public final int WEIGHT = 1;
    public final String ICON = "";
    public final int MAX_VALUES_ON_CELL = 200;
    private Cell cell;

    public Plant grow(){
        return new Plant();
    }
    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public String getName() {
        return NAME;
    }

    public int getWeight() {
        return WEIGHT;
    }

    public int getMaxValuesOnCell() {
        return MAX_VALUES_ON_CELL;
    }


}

package com.sanik85.company.Island.AbstractOrganisms;

import com.sanik85.company.Island.IslandMap.Cell;

public abstract class Organism {
//    String name;
//    int weight;
//    String icon;
//    int maxAmountOnCell;
    public abstract Cell getCell();
    public abstract void setCell(Cell ceel);
    public abstract int getMaxMove();
    public abstract int getMaxAmountOnCell();

}

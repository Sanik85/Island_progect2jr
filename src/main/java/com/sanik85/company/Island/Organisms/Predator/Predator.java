package com.sanik85.company.Island.Organisms.Predator;


import com.sanik85.company.Island.AbstractOrganisms.Animal;
import com.sanik85.company.Island.IslandMap.Cell;

public class Predator extends Animal {

    @Override
    public Cell getCell() {
        return null;
    }

    @Override
    public void setCell(Cell ceel) {

    }

    @Override
    public int getMaxMove() {
        return 0;
    }

    @Override
    public int getMaxAmountOnCell() {
        return 0;
    }
}

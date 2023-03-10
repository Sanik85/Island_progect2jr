package com.sanik85.company.Island.Organisms.Predator;

import com.sanik85.company.Island.AbstractOrganisms.Organism;
import com.sanik85.company.Island.IslandMap.Cell;
import com.sanik85.company.Island.Organisms.Herbivore.*;
import com.sanik85.company.Island.Organisms.Plants.Plant;

import java.util.HashMap;
import java.util.Map;

public class Boa extends Predator{
    public static final String NAME = "Boa";
    public static final int WEIGHT = 15;
    public static final String ICON = "\uD83D\uDC0D";
    public static final int MAX_VALUES_ON_CELL = 30;
    public static final int MAX_MOVE = 1;
    public static final int AMOUNT_OF_FOOD = 3;
    public static Map<Class<? extends Organism>, Integer> probabilityToEating = new HashMap<>();
    private Cell cell;
    public Boa(){
        initProbabilityToEating();
    }
    private void initProbabilityToEating(){
        probabilityToEating.put(Wolf.class, 0);
        probabilityToEating.put(Boa.class, 0);
        probabilityToEating.put(Fox.class, 15);
        probabilityToEating.put(Bear.class, 0);
        probabilityToEating.put(Eagle.class, 0);
        probabilityToEating.put(Horse.class, 0);
        probabilityToEating.put(Deer.class, 0);
        probabilityToEating.put(Rabbit.class, 20);
        probabilityToEating.put(Mouse.class, 40);
        probabilityToEating.put(Goat.class, 0);
        probabilityToEating.put(Sheep.class, 0);
        probabilityToEating.put(Boar.class, 0);
        probabilityToEating.put(Buffalo.class, 0);
        probabilityToEating.put(Duck.class, 10);
        probabilityToEating.put(Caterpillar.class, 0);
        probabilityToEating.put(Plant.class, 0);
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
        return this.MAX_MOVE;
    }

    @Override
    public int getMaxAmountOnCell() {
        return this.MAX_VALUES_ON_CELL;
    }
}

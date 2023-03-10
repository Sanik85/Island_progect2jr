package com.sanik85.company.Island.IslandMap;

import com.sanik85.company.Island.AbstractOrganisms.Organism;

import java.util.*;

public class Cell {
    int i;
    int j;
    Cell[][] cells = new Cell[i][j];
    List<Organism> organismList = new ArrayList<>();
    private volatile Map<Class<? extends Organism>, Set<Organism>> organisms = new HashMap<>();

}

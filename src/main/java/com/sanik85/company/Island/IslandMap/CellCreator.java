package com.sanik85.company.Island.IslandMap;

import com.sanik85.company.Island.AbstractOrganisms.Organism;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CellCreator {
    public Cell createCell(List<Organism> typeOfOrganisms){
        Cell cell = new Cell();
        for (Organism typeOfOrganism : typeOfOrganisms) {
            for (int i = 0; i < ThreadLocalRandom.current().nextInt(typeOfOrganism.getMaxAmountOnCell()); i++) {
                
            }
        }

        return null;
    }
}

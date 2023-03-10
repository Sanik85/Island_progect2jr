package com.sanik85.company.Island.IslandMap;

import com.sanik85.company.Island.AbstractOrganisms.Organism;
import com.sanik85.company.Island.Repository.OrganismCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Island {
    private final CellCreator cellCreator = new CellCreator();
    private final List<Organism> typesOfOrganisms;
    public volatile Cell[][] cells;
    public int i;
    public int j;

    public Island(List<Organism> typesOfOrganisms, Cell[][] cells, int i, int j) {
        this.typesOfOrganisms = typesOfOrganisms;
        this.cells = new Cell[i][j];
    }

//    public void createCell(){
//        for (int k = 0; k < cells.length; k++) {
//            for (int l = 0; l < cells[k].length; l++) {
//                cells[k][l] = cellCreator.createCell(typesOfOrganisms);
//            }
//        }
//    }


    public Cell nextCell(Cell cell){
        Random random = new Random();
        List<Cell> nextSteps = new ArrayList<>();
        Cell nextStep;
        if (i == 0 && j == 0){
            nextSteps = List.of(cells[i + 1][j], cells [i][j + 1]);
        }
        else if (i == cells.length - 1 && j == 0){
            nextSteps = List.of(cells[i - 1][j], cells[i][j + 1]);
        }
        else if (i == 0 && j == cells[i].length - 1){
            nextSteps = List.of(cells[i][j - 1], cells[i + 1][j]);
        }
        else if (i == cells.length - 1 && j == cells[i].length - 1){
            nextSteps = List.of(cells[i][j - 1], cells[i - 1][j]);
        }
        else if (0 < i && i < cells.length - 1 && j == 0){
            nextSteps = List.of(cells[i - 1][j], cells[i + 1][j], cells[i][j + 1]);
        }
        else if (0 < i && i < cells.length - 1 && j == cells[i].length - 1){
            nextSteps = List.of(cells[i - 1][j], cells[i + 1][j], cells[i][j - 1]);
        }
        else if (i == 0 && 0 < j && j < cells[i].length - 1){
            nextSteps = List.of(cells[i][j - 1], cells[i][j + 1], cells[i + 1][j]);
        }
        else if (i == cells.length - 1 && 0 < j && j < cells[i].length - 1){
            nextSteps = List.of(cells[i][j - 1], cells[i][j + 1], cells[i - 1][j]);
        }
        else if (0 < i && i < cells.length - 1 && 0 < j && j < cells[i].length - 1){
            nextSteps = List.of(cells[i][j - 1], cells[i][j + 1], cells[i - 1][j], cells[i + 1][j]);
        }
        int randomIndex = random.nextInt(0, nextSteps.size());
        nextStep = nextSteps.get(randomIndex);
        return nextStep;
    }
}

package com.sanik85.company.Island;

import com.sanik85.company.Island.AbstractOrganisms.Organism;
import com.sanik85.company.Island.Organisms.Predator.Fox;
import com.sanik85.company.Island.Organisms.Predator.Wolf;
import com.sanik85.company.Island.Repository.OrganismCreator;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Organism> organisms = new ArrayList<>();
        OrganismCreator organismCreator = new OrganismCreator();

        Wolf wolf = new Wolf();

        Fox fox = new Fox();

        Class clazz = wolf.getClass();
        organismCreator.reproduce(wolf);

        for (int i = 0; i < wolf.MAX_VALUES_ON_CELL; i++) {
            organisms.add(organismCreator.reproduce(wolf));
        }
        System.out.println(organisms.size());

        for (Organism organism : organisms) {
            System.out.println(organism);
        }


    }
}
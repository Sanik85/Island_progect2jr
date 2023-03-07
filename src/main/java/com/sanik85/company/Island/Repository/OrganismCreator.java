package com.sanik85.company.Island.Repository;

import com.sanik85.company.Island.AbstractOrganisms.Organism;
import com.sanik85.company.Island.Organisms.Herbivore.*;
import com.sanik85.company.Island.Organisms.Plants.Plant;
import com.sanik85.company.Island.Organisms.Predator.*;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public class OrganismCreator {

    private static final Set<Organism> ORGANISMS_TYPES = new HashSet<>();


    static {
        ORGANISMS_TYPES.add(new Bear());
        ORGANISMS_TYPES.add(new Boa());
        ORGANISMS_TYPES.add(new Eagle());
        ORGANISMS_TYPES.add(new Fox());
        ORGANISMS_TYPES.add(new Wolf());

        ORGANISMS_TYPES.add(new Boar());
        ORGANISMS_TYPES.add(new Buffalo());
        ORGANISMS_TYPES.add(new Caterpillar());
        ORGANISMS_TYPES.add(new Deer());
        ORGANISMS_TYPES.add(new Duck());
        ORGANISMS_TYPES.add(new Goat());
        ORGANISMS_TYPES.add(new Horse());
        ORGANISMS_TYPES.add(new Mouse());
        ORGANISMS_TYPES.add(new Rabbit());
        ORGANISMS_TYPES.add(new Sheep());

        ORGANISMS_TYPES.add(new Plant());
    }

    public Organism reproduce2(Organism organism){
        Organism organism1 = null;
        for (Organism organismsType : ORGANISMS_TYPES) {
            if (organism.getClass().equals(organismsType.getClass())){
                organism1 = organismsType;
            }
        }
        return organism1;
    }

    public Organism reproduce(Organism organism) {

        try {
            return organism.getClass().getConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}

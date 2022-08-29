package com.singtel;


import com.singtel.actions.*;
import com.singtel.model.Animal;
import com.singtel.model.Bird;
import com.singtel.model.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Slf4j
public class TestScenario4 {

    Animal[] animals;
    int flyAnimals;
    int walkAnimals;
    int singAnimals;
    int swimAnimals;

    @Before
    public void setUp() throws Exception {
        animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        flyAnimals = 0;
        walkAnimals = 0;
        singAnimals = 0;
        swimAnimals = 0;
    }

    @After
    public void tearDown() throws Exception {
        animals = null;
    }

    // Test C1
    @Test
    public void testCountAnimals() {
        log.info("--- testCountAnimals ---");
        for (Animal animal : animals) {
            if (animal instanceof Flyer) {
                flyAnimals++;
            }
            if (animal instanceof Walker) {
                walkAnimals++;
            }
            if (animal instanceof Singer) {
                singAnimals++;
            }
            if (animal instanceof Swimmer) {
                swimAnimals++;
            }
        }
        // Parrot, Butterfly
        assertEquals(flyAnimals, 2);
        // Bird, Duck, Chicken, Rooster, Parrot, Frog, Dog, Cat
        assertEquals(walkAnimals, 8);
        // Bird, Duck, Chicken, Rooster, Parrot
        assertEquals(singAnimals, 5);
        // Duck, Fish, Shark, Clownfish, Dolphin, Frog
        assertEquals(swimAnimals, 6);
    }

}

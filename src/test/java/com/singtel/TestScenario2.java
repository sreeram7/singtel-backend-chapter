package com.singtel;

import com.singtel.actions.Singer;
import com.singtel.actions.Walker;
import com.singtel.model.Clownfish;
import com.singtel.model.Dolphin;
import com.singtel.model.Fish;
import com.singtel.model.Shark;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

@Slf4j
public class TestScenario2 {

    Fish fish;
    Shark shark;
    Clownfish clownfish;
    Dolphin dolphin;

    @Before
    public void setUp() throws Exception {
        fish = new Fish();
        shark = new Shark("Shark");
        clownfish = new Clownfish("Clownfish");
        dolphin = new Dolphin();
    }

    @After
    public void tearDown() throws Exception {
        fish = null;
        shark = null;
        clownfish = null;
        dolphin = null;
    }

    // Test B1
    @Test
    public void testFishDoesNotSing() {
        log.info("--- testFishDoesNotSing ---");
        assertTrue(!(fish instanceof Singer));
    }

    @Test
    public void testFishDoesNotWalk() {
        log.info("--- testFishDoesNotWalk ---");
        assertTrue(!(fish instanceof Walker));
    }

    @Test
    public void testFishSwims() {
        log.info("--- testFishCannotSing ---");
        assertTrue(fish.swim());
    }
}
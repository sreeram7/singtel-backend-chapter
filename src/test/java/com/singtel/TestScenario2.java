package com.singtel;

import com.singtel.actions.Singer;
import com.singtel.actions.Walker;
import com.singtel.enums.Color;
import com.singtel.enums.Size;
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

    @Test
    public void testSharkIsLargeAndGrey() {
        log.info("--- testSharkIsLargeAndGrey ---");
        assertTrue(shark.getColor().equals(Color.GREY));
        assertTrue(shark.getSize().equals(Size.LARGE));
    }

    @Test
    public void testClownfishIsSmallAndOrange() {
        log.info("--- testClownfishIsSmallAndOrange ---");
        assertTrue(clownfish.getColor().equals(Color.ORANGE));
        assertTrue(clownfish.getSize().equals(Size.SMALL));
    }

    @Test
    public void testClownfishMakesJokes() {
        log.info("--- testClownfishMakesJokes ---");
        assertTrue(clownfish.makeJokes());
    }

    @Test
    public void testSharkEatsOtherFish() {
        log.info("--- testSharkEatsOtherFish ---");
        assertTrue(shark.prey());
    }
}
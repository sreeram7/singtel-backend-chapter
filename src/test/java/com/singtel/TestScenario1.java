package com.singtel;

import com.singtel.actions.Flyer;
import com.singtel.enums.Sound;
import com.singtel.model.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Slf4j
public class TestScenario1 {

	Bird bird;

    @Before
    public void setUp() throws Exception {
        bird = new Bird();
    }

    @After
    public void tearDown() throws Exception {
        bird = null;
    }

    // Test A1
    @Test
    public void testBirdSings() {
        log.info("--- test Bird Sings ---");
        assertEquals(bird.sing(), Sound.BIRD.getSound());
    }

    @Test
    public void testBirdFlies() {
        log.info("--- test Bird Flies ---");
        assertTrue(!(bird instanceof Flyer));// Not All birds can Fly
        log.info("Not every bird can fly");
    }
}

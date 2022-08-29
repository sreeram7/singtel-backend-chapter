package com.singtel;


import com.singtel.actions.Flyer;
import com.singtel.actions.Onomatopoeic;
import com.singtel.model.Butterfly;
import com.singtel.model.Caterpillar;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

@Slf4j
public class TestScenario3 {

    Caterpillar caterpillar;
    Butterfly butterfly;

    @Before
    public void setUp() throws Exception {
        caterpillar = new Caterpillar();
        butterfly = caterpillar.metamorphosis();
    }

    @After
    public void tearDown() throws Exception {
        caterpillar = null;
        butterfly = null;
    }

    // Test C1
    @Test
    public void testButterfliesFly() {
        log.info("--- testButterfliesFly ---");
        assertTrue(butterfly.fly());
    }

    @Test
    public void testButterfliesCannotMakeSound() {
        log.info("--- testButterfliesCannotMakeSound ---");
        assertTrue(!(butterfly instanceof Onomatopoeic));
        log.info("Butterflies do not make sound");
    }

    // Test C2
    @Test
    public void testCaterpillarCannotFly() {
        log.info("--- testCaterpillarCannotFly ---");
        assertTrue(!(caterpillar instanceof Flyer));
    }

    @Test
    public void testCaterpillarWalks() {
        log.info("--- testCaterpillarWalks ---");
        assertTrue(caterpillar.walk());
    }
}

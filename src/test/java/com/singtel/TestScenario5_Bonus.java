package com.singtel;


import com.singtel.enums.Sound;
import com.singtel.model.Rooster;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

@Slf4j
public class TestScenario5_Bonus {

    Rooster rooster;

    @Before
    public void setUp() throws Exception {
        rooster = new Rooster();
    }

    @After
    public void tearDown() throws Exception {
        rooster = null;
    }

    // Test E1
    @Test
    public void testRoosterSingsInOtherLanguage() {
        log.info("--- testRoosterSingsInOtherLanguage ---");
        assertEquals(rooster.sing(), Sound.ROOSTER.getSound());
        log.info("--- Rooster sings in Burmese ---");
        assertEquals(rooster.sing("Burmese"), Sound.ROOSTER.getSoundInBurmese());
        log.info("--- Rooster sings in Chinese ---");
        assertEquals(rooster.sing("Chinese"), Sound.ROOSTER.getSound());
    }

}

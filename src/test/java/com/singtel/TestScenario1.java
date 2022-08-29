package com.singtel;

import com.singtel.enums.Sound;
import com.singtel.model.*;
import com.singtel.actions.Flyer;
import com.singtel.actions.Swimmer;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Slf4j
public class TestScenario1 {

	Bird bird;
    Duck duck;
    Chicken chicken;

    Rooster rooster;

    Parrot parrotLivesWithDogs;
    Parrot parrotLivesWithCats;
    Parrot parrotLivesWithRooster;
    Parrot parrotLivesWithDucks;
    Parrot parrotListensToPhoneRingings;

    Dog dog;
    Cat cat;

    @Before
    public void setUp() throws Exception {
        bird = new Bird();

        duck = new Duck();
        chicken = new Chicken();
        rooster = chicken.grow();

        dog = new Dog();
        cat = new Cat();

        parrotLivesWithDogs = new Parrot();
        parrotLivesWithDogs.setSoundLearnt(dog.sound());

        parrotLivesWithCats = new Parrot();
        parrotLivesWithCats.setSoundLearnt(cat.sound());

        parrotLivesWithRooster = new Parrot();
        parrotLivesWithRooster.setSoundLearnt(rooster.sing());

        parrotLivesWithDucks = new Parrot();
        parrotLivesWithDucks.setSoundLearnt(duck.sing());

        parrotListensToPhoneRingings = new Parrot();
        parrotListensToPhoneRingings.setSoundLearnt(Sound.PHONE_RINGTONE.getSound());
    }

    @After
    public void tearDown() throws Exception {
        bird = null;
        duck = null;
        chicken = null;
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
        assertTrue(!(bird instanceof Flyer));
        log.info("Not every bird can fly");
    }

    // Scenario 2
    @Test
    public void testDuckSings() {
        log.info("--- testDuckSings ---");
        assertEquals(duck.sing(), Sound.DUCK.getSound());
    }

    @Test
    public void testDuckSwims() {
        log.info("--- testDuckSwims ---");
        assertTrue(duck instanceof Swimmer);
        assertTrue(duck.swim());
    }

    @Test
    public void testChickenSings() {
        log.info("--- testChickenSings ---");
        assertEquals(chicken.sing(), Sound.CHICKEN.getSound());
    }

    @Test
    public void testChickenCannotFly() {
        log.info("--- testChickenCannotFly ---");
        assertTrue(!(chicken instanceof Flyer));
        log.info("Chicken cannot fly");
    }

    @Test
    public void testRoosterSings() {
        log.info("--- testRoosterSings ---");
        assertEquals(rooster.sing(), Sound.ROOSTER.getSound());
    }


    @Test
    public void testParrotMimicsDogSound() {
        log.info("--- testParrotMimicsDogSound ---");
        assertEquals(parrotLivesWithDogs.mimicSound(), Sound.DOG.getSound());
    }

    @Test
    public void testParrotMimicsCatSound() {
        log.info("--- testParrotMimicsCatSound ---");
        assertEquals(parrotLivesWithCats.mimicSound(), Sound.CAT.getSound());
    }

    @Test
    public void testParrotMimicsRoosterSound() {
        log.info("--- testParrotMimicsRoosterSound ---");
        assertEquals(parrotLivesWithRooster.mimicSound(), Sound.ROOSTER.getSound());
    }

    @Test
    public void testParrotMimicsDuckSound() {
        log.info("--- testParrotMimicsDuckSound ---");
        assertEquals(parrotLivesWithDucks.mimicSound(), Sound.DUCK.getSound());
    }

    @Test
    public void testParrotMimicsPhoneRingingsSound() {
        log.info("--- testParrotMimicsPhoneRingingsSound ---");
        assertEquals(parrotListensToPhoneRingings.mimicSound(), Sound.PHONE_RINGTONE.getSound());
    }
}

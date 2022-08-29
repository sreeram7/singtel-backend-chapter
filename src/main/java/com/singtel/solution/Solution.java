package com.singtel.solution;

import com.singtel.enums.Sound;
import com.singtel.model.*;
import org.apache.logging.log4j.Logger;

import lombok.extern.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {
	public static void main(String[] args) {
		try {
			log.info("--- Bird ---");
			Bird bird = new Bird();
			bird.walk();
			//  bird.fly();// All birds cannot Fly
			bird.sing();
			log.info("--- Chicken ---");
			Chicken chicken = new Chicken();
			chicken.walk();
			chicken.sing();
//            chicken.fly();// Chicken cannot fly
			log.info("--- Duck ---");
			Duck duck = new Duck();
			duck.walk();
			duck.swim();
			duck.sing();
			String duckSound = duck.sing();

			log.info("--- Rooster ---");
			Rooster rooster = chicken.grow();//Chicken grows to Rooster
			rooster.walk();
			rooster.sing();
			String roosterSound = rooster.sing();
//            rooster.fly();// Rooster cannot fly too

			log.info("--- Dog ---");
			Dog dog = new Dog();
			dog.walk();
			String dogSound = dog.sound();

			log.info("--- Cat ---");
			Cat cat = new Cat();
			cat.walk();
			String catSound = cat.sound();

			log.info("--- Parrot 1 lives with dog ---");
			Parrot parrot1 = new Parrot();
			parrot1.setSoundLearnt(dogSound);
			parrot1.walk();
			parrot1.fly();
			parrot1.sing();
			parrot1.mimicSound();

			log.info("--- Parrot 2 lives with cats ---");
			Parrot parrot2 = new Parrot(catSound);
			parrot2.walk();
			parrot2.fly();
			parrot2.sing();
			parrot2.mimicSound();

			log.info("--- Parrot 3 lives with roosters ---");
			Parrot parrot3 = new Parrot(roosterSound);
			parrot3.walk();
			parrot3.fly();
			parrot3.sing();
			parrot3.mimicSound();

			log.info("--- Parrot 4 lives with ducks ---");
			Parrot parrot4 = new Parrot(duckSound);
			parrot4.walk();
			parrot4.fly();
			parrot4.sing();
			parrot4.mimicSound();

			log.info("--- Parrot 5 used to listen phone ringings ---");
			Parrot parrot5 = new Parrot(Sound.PHONE_RINGTONE.getSound());
			parrot5.walk();
			parrot5.fly();
			parrot5.sing();
			parrot5.mimicSound();

		} catch (Exception e) {
			log.error("Exception : {}", e);
		}
	}
}
package com.singtel.application;


import com.singtel.actions.*;
import com.singtel.model.Animal;
import com.singtel.model.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountSummary {

    public static void main(String[] args) {
        int fly = 0;
        int walk = 0;
        int sing = 0;
        int swim = 0;
        Animal[] animals = new Animal[]{
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

        for (Animal animal : animals) {
            if (animal instanceof Flyer) {
                fly++;
            }
            if (animal instanceof Walker) {
                walk++;
            }
            if (animal instanceof Singer) {
                sing++;
            }
            if (animal instanceof Swimmer) {
                swim++;
            }
        }
        log.info("1.\tHow many of these animals can fly = " + fly);
        log.info("2.\tHow many of these animals can walk = " + walk);
        log.info("3.\tHow many of these animals can sing = " + sing);
        log.info("4.\tHow many of these animals can swim = " + swim);
    }
}

package com.singtel.model;


import com.singtel.actions.Onomatopoeic;
import com.singtel.actions.Swimmer;
import com.singtel.actions.Walker;
import com.singtel.enums.Sound;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Frog extends Animal implements Walker, Swimmer, Onomatopoeic {

    public Frog() {
        super();
    }

    public Frog(String name) {
        super(name);
    }

    @Override
    public boolean walk() {
        log.info("I can walk - technically hopping around!");
        return true;
    }

    @Override
    public boolean swim() {
        log.info("I can swim.");
        return true;
    }

    @Override
    public String sound() {
        log.info(Sound.FROG.getSound());
        return Sound.FROG.getSound();
    }
}

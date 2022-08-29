package com.singtel.model;


import com.singtel.actions.Onomatopoeic;
import com.singtel.actions.Walker;
import com.singtel.enums.Sound;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog extends Animal implements Walker, Onomatopoeic {

    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public boolean walk() {
        log.info("I am walking");
        return true;
    }

    @Override
    public String sound() {
        log.info(Sound.DOG.getSound());
        return Sound.DOG.getSound();
    }

}
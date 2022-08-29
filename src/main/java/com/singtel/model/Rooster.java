package com.singtel.model;

import com.singtel.enums.Sound;
import com.singtel.enums.Sound;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rooster extends Bird {
    private Chicken chicken;

    public Rooster() {
        super();
    }

    public Rooster(String name) {
        super(name);
    }

    public Rooster(Chicken chicken) {
        super();
        this.chicken = chicken;
    }

    @Override
    public String sing() {
        log.info(Sound.ROOSTER.getSound());
        return Sound.ROOSTER.getSound();
    }

}


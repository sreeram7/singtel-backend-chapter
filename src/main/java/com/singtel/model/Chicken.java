package com.singtel.model;

import com.singtel.actions.Grower;
import com.singtel.enums.Sound;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Chicken extends Bird implements Grower<Rooster> {


    public Chicken() {
        super();
    }

    public Chicken(String name) {
        super(name);
    }

    @Override
    public String sing() {
        log.info(Sound.CHICKEN.getSound());
        return Sound.CHICKEN.getSound();
    }

    @Override
    public Rooster grow() throws Exception {
        return new Rooster(this);
    }

}

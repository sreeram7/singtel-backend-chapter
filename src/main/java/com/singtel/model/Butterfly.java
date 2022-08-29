package com.singtel.model;


import com.singtel.actions.Flyer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Butterfly extends Insect implements Flyer {

    private Caterpillar caterpillar;

    public Butterfly() {
        super();
    }

    public Butterfly(String name) {
        super(name);
    }

    public Butterfly(Caterpillar caterpillar) {
        super();
        this.caterpillar = caterpillar;
    }

    @Override
    public boolean fly() {
        log.info("I can fly because I am a butterfly.");
        return true;
    }

}

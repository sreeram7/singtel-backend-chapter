package com.singtel.model;

import com.singtel.actions.Carnivore;
import com.singtel.enums.Color;
import com.singtel.enums.Size;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Shark extends Fish implements Carnivore {

    public Shark() {
        super();
    }

    public Shark(String name) {
        super(name, Color.GREY, Size.LARGE);
    }

    @Override
    public boolean prey() {
        log.info("I hunt and eat other fish");
        return true;
    }

}
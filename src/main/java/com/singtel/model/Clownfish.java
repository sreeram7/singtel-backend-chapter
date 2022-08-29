package com.singtel.model;


import com.singtel.actions.Joker;
import com.singtel.enums.Color;
import com.singtel.enums.Size;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Clownfish extends Fish implements Joker {

    public Clownfish() {
        super();
    }

    public Clownfish(String name) {
        super(name, Color.ORANGE, Size.SMALL);
    }

    @Override
    public boolean makeJokes() {
        log.info("I am making jokes.");
        return true;
    }

}

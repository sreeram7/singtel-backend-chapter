package com.singtel.model;


import com.singtel.actions.Swimmer;
import com.singtel.enums.Color;
import com.singtel.enums.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class Fish extends Animal implements Swimmer {

    private Color color;
    private Size size;

    public Fish() {
        super();
    }

    public Fish(String name) {
        super(name);
    }

    public Fish(String name, Color color, Size size) {
        super(name);
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean swim() {
        log.info("I am swimming");
        return true;
    }

}

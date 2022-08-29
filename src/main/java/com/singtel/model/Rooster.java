package com.singtel.model;

import com.singtel.enums.Sound;
import com.singtel.enums.Sound;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

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

    public String sing(String language) {
        if (StringUtils.equalsIgnoreCase(language, "Burmese")) {
            log.info(Sound.ROOSTER.getSoundInBurmese());
            return Sound.ROOSTER.getSoundInBurmese();
        }
        log.info("Desired language {} is not yet supported. Returning default in English.", language);
        log.info(Sound.ROOSTER.getSound());
        return Sound.ROOSTER.getSound();
    }

}


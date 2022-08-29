package com.singtel.restful.service;

import com.singtel.model.Animal;
import com.singtel.model.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AnimalServiceImpl implements AnimalService {

    private Map<String, Animal> mapAnimals;

    @PostConstruct
    private void init() {
        mapAnimals = new HashMap<>();
        mapAnimals.put("BIRD", new Bird("Bird"));
        mapAnimals.put("DUCK", new Duck("Duck"));
        mapAnimals.put("CHICKEN", new Chicken("Chicken"));
        mapAnimals.put("ROOSTER", new Rooster("Rooster"));
        mapAnimals.put("PARROT", new Parrot("Parrot"));
        mapAnimals.put("FISH", new Fish("Fish"));
        mapAnimals.put("SHARK", new Shark("Shark"));
        mapAnimals.put("CLOWNFISH", new Clownfish("Clownfish"));
        mapAnimals.put("DOLPHIN", new Dolphin("Dolphin"));
        mapAnimals.put("FROG", new Frog("Frog"));
        mapAnimals.put("DOG", new Dog("Dog"));
        mapAnimals.put("CATERPILLAR", new Caterpillar("Caterpillar"));
        mapAnimals.put("BUTTERFLY", new Butterfly("Butterfly"));
        mapAnimals.put("CAT", new Cat("Cat"));
    }

    public List<Animal> getAll() {
        return new ArrayList<Animal>(mapAnimals.values());
    }

    public Animal getByName(String name) {
        if (mapAnimals.get(name.toUpperCase()) != null) {
            return mapAnimals.get(name.toUpperCase());
        }
        return null;
    }

}

package com.singtel.restful.controller;

import com.google.gson.Gson;
import com.singtel.restful.service.AnimalServiceImpl;
import com.singtel.model.Animal;
import com.singtel.restful.service.AnimalServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalServiceImpl animalService;

    @Autowired
    @Qualifier("getGsonMapper")
    private Gson gsonMapper;

    @GetMapping(value = "getAll", produces = "application/json")
    public ResponseEntity<String> getAll() {
        log.info("getAll Request");
        String response = "";
        try {
            response = gsonMapper.toJson(animalService.getAll(), List.class);
        } catch (Exception e) {
            log.error("Exception in getAll : {}", e);
            return new ResponseEntity<>("Failed to retrieve Animals", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        log.info("getAll Response : {}", response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "getByName", produces = "application/json")
    public ResponseEntity<String> getByName(@RequestParam String name) {
        log.info("getByName Request : name = {}", name);
        String response = "";
        try {
            Animal animal = animalService.getByName(name);
            if (animal == null) {
                log.info("getByName Response : Not found");
                return new ResponseEntity<>("Animal does not exist", HttpStatus.NOT_FOUND);
            }
            response = gsonMapper.toJson(animal,Object.class);
        } catch (Exception e) {
            log.error("Exception in getByName : {}", e);
            return new ResponseEntity<>("Failed to retrieve Animals", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        log.info("getByName Response : {}", response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}










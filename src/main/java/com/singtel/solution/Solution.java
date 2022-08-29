package com.singtel.solution;

import com.singtel.model.Chicken;
import com.singtel.model.Duck;
import org.apache.logging.log4j.Logger;

import com.singtel.model.Bird;

import lombok.extern.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {
	    public static void main(String[] args) {
	        try {
	            log.info("--- Bird ---");
	            Bird bird = new Bird();
	            bird.walk();
	            bird.sing();

				log.info("--- Chicken ---");
				Chicken chicken = new Chicken();
				chicken.walk();
				chicken.sing();
//            chicken.fly();// Chicken cannot fly

				log.info("--- Duck ---");
				Duck duck = new Duck();
				duck.walk();
				duck.swim();
				duck.sing();


	        } catch (Exception e) {
	        	
	            log.error("Exception : {}", e);
	        }


	    }
}

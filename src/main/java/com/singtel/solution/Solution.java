package com.singtel.solution;

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
	            //  bird.fly();// All birds cannot Fly
	            bird.sing();
	        } catch (Exception e) {
	        	
	            log.error("Exception : {}", e);
	        }
	    }
}

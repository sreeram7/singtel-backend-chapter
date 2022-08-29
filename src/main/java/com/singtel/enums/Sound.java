package com.singtel.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Sound {

	BIRD("I am singing"),
	CHICKEN("Cluck Cluck"),
	DUCK("Quack Quack"),
	ROOSTER("Cock-a-doodle-doo"),

	DOG("Woof woof"),
	CAT("Meow meow"),
	PARROT("Squawk squawk"),
	PHONE_RINGTONE("Ring ring");

	private String sound;

	 
}

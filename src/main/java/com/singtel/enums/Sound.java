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
	DUCK("Quack Quack");

	private String sound;

	 
}

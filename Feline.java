package com.revature.day03.animals;

public abstract class Feline implements Animal {

	private String picture = "";
	private String food;
	private String hunger = "";
	private String boundaries = "Clowder";
	private String location = "";
	
	public String roam() {
		return "Clowder";
	}
}

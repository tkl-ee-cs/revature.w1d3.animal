package com.revature.day03.animals;

public abstract class Canine implements Animal {

	private String picture = "";
	private String food;
	private String hunger;
	private String boundaries = "Pack";
	private String location;
	
	public String roam() {
		return "Pack";
	}
}

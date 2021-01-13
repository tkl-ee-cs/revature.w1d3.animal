package com.revature.day03.animals;

public class Wolf extends Canine {

	private String food = "Hunt";
	private int hunger = 0;
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		hunger+=6;
		return food;
	}

	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return "Den";
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Howl";
	}
}

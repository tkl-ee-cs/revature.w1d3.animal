package com.revature.day03.animals;

public class Lion extends Feline {

	private String food = "Prey";
	private int hunger = 0;
	
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		hunger+=10;
		return food;
	}

	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return "Savannah";
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Roar";
	}
}
